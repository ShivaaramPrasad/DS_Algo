package two_pointers;

import org.junit.Test;

public class ReverseVowels {
	
	@Test
	public void example1() {
		String str = "Babu";
		// Buba
		System.out.println(reverseVowelsOnly(str));
	}
	
	@Test
	public void example2() {
		String str = "winnerofcode";
		//wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}
	
	@Test
	public void example3() {
		String str = "hllyrt";
		//wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}
	
	@Test
	public void example4() {
		String str = "hlllloei";
		//wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}
	/*
	 * 
	 *  1) left = 0 ; right = len-1
		2) left <= right
		3) If left and right are vowels -> swap them and move both pointers
		4) If left is not vowel -> move left
		5) If right is not vowel -> move right
		6) Finally convert ch[] -> String 
	 */
			
	
	// Performance
	// Time Complexity: Worst O[N]
	// Space Complexity: Character[] -> Size of string -> O[N] 
	// StringBuffer -> Same character count of size 
	
	private String reverseVowelsOnly(String str) {
		
		if(str.trim().length() < 2)
			return str;
		
		char[] ch = str.toCharArray();
		int left = 0, right = ch.length-1;		
		while(left < right) {
			if(isVowel(ch[left]) && isVowel(ch[right])) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				right--;
				left++;
			} else if(!isVowel(ch[left])) {
				left++;
			} else if(!isVowel(ch[right])) {
				right--;
			}
		}
		return new String(ch);
	}
	
	private boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
