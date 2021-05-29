package hash;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordPattern {
	
	private boolean isPatternMatches(String pattern, String s) {
		Map<Object, Integer> map_index = new HashMap<Object, Integer>();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map_index.containsKey(c))
                map_index.put(c, i);

            if (!map_index.containsKey(w))
                map_index.put(w, i);

            if (map_index.get(c) != map_index.get(w))
                return false;
        }

        return true;
	}

	@Test
	public void example1() {
		String pattern = "abba";
		String input = "dog cat cat dog";
		boolean matches = isPatternMatches(pattern, input);
		System.out.println(matches);
	}

	@Test
	public void example2() {
		String pattern = "abba";
		String input = "dog cat cat fish";
		boolean matches = isPatternMatches(pattern, input);
		System.out.println(matches);
	}

	@Test
	public void example3() {
		String pattern = "abc";
		String input = "hello world world";
		boolean matches = isPatternMatches(pattern, input);
		System.out.println(matches);
	}
}
