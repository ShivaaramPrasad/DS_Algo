package weekTwo.homeWork.copy;

import java.util.Arrays;

import org.junit.Test;

/*
Find if the given anagram is substring of the input string. 

Example 1:
Input="acbbabccaabcab"
anagram="abc"
Output: true
Explanation: substring(0,2) is anagram of "abc"

Example 2:
Input="acbbabccaabcab"
anagram="abd"
Output: false
*/

public class IsAnagram {

	@Test
	public void example1() {
		String input = "acbbabccaabcab";
		String anag = "abc";
		System.out.println(isSubstringAnagram(input, anag));
	}

	@Test
	public void example2() {
		String input = "acbbabccaabcab";
		String anag = "abd";
		System.out.println(isSubstringAnagram(input, anag));
	}
	
	@Test
	public void example3() {
		String input = "aabccddffedcba";
		String anag = "def";
		System.out.println(isSubstringAnagram(input, anag));
	}

	private boolean isSubstringAnagram(String input,String anag) {
		int[] inpArr=new int[26];
		int[] anagArr=new int[26];
		
		for(char c:anag.toCharArray())
			anagArr[c-'a']++;
		
		int start=0,end=0;
		
		while(end<input.length()) {
			inpArr[input.charAt(end++)-'a']++;
			
			if(end>anag.length())
				inpArr[input.charAt(start++)-'a']--;
			
			if(Arrays.equals(inpArr, anagArr))
				return true;
		}
		
		return false;
	}
}
