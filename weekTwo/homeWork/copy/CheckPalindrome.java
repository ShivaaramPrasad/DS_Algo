package weekTwo.homeWork.copy;

import org.junit.Test;

/*
Give a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: for the purpose of this problem, we define empty string as valid palindrome

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false
*/

public class CheckPalindrome {

	@Test
	public void example1() {
		String input = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(input));
	}

	@Test
	public void example2() {
		String input = "race a car";
		System.out.println(isPalindrome(input));
	}

	@Test
	public void example3() {
		String input = "  ";
		System.out.println(isPalindrome(input));
	}

	private boolean isPalindrome(String input) {
		input = input.toLowerCase().replaceAll("[\\W+\\s+]", "");

		if (input.length() < 2)
			return true;

		int left = 0, right = input.length() - 1;

		while (left < right)
			if (input.charAt(left++) != input.charAt(right--))
				return false;

		return true;
	}
}
