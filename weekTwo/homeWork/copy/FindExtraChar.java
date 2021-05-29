package weekTwo.homeWork.copy;

import java.util.Arrays;

import org.junit.Test;

/*
Given 2 string with length n and n+1 respectively. the second string contains all the character of first but with an extra char. 
write the code to find the extra char.

Example 1:
Input:
A1="Test"
A2="Test$"
Output: '$'

Example 2:
Input: A1="Hello"
A2="lloreH"
Output: 'r'
*/

public class FindExtraChar {

	@Test
	public void example1() {
		String a1 = "Test";
		String a2 = "Test$";
		System.out.println(findExtraChar(a1, a2));
	}

	@Test
	public void example2() {
		String a1 = "Hello";
		String a2 = "lloreH";
		System.out.println(findExtraChar(a1, a2));
	}

	private char findExtraChar(String a1, String a2) {

		char[] a1char = a1.toCharArray();
		char[] a2char = a2.toCharArray();

		Arrays.sort(a1char);
		Arrays.sort(a2char);
		int p1 = 0, p2 = 0;

		while (p1 < a1char.length && p2 < a2char.length) {
			if (a1char[p1] != a2char[p2])
				return a2char[p2];

			p1++;
			p2++;
		}

		return a2char[p2];
	}
}
