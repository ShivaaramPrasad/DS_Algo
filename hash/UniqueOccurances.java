package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class UniqueOccurances {
	private boolean isUnique(int[] data) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < data.length; i++) {
			map.put(data[i], map.getOrDefault(data[i], 0)+1);
		}
		
		Set<Integer> unique = new HashSet<>(map.values());
		return unique.size() == map.size();
	}

	@Test
	public void example1() {
		int[] data = {1,2,2,1,1,3};
		boolean unique = isUnique(data);
		System.out.println(unique);
	}
	
	@Test
	public void example2() {
		int[] data = {1,2};
		boolean unique = isUnique(data);
		System.out.println(unique);
	}

	@Test
	public void example3() {
		int[] data = {-3,0,1,-3,1,1,1,-3,10,0};
		boolean unique = isUnique(data);
		System.out.println(unique);
	}
	
}
