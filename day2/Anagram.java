package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Anagram {
	
	/*1) Write a function to check whether two given strings 
	are anagram of each other or not. An anagram 
	of a string is another string that contains the same characters, 
	only the order of characters can be different. 
	For example, “abcd” and “dabc” are an anagram of each other.*/
	
	/*
	 * 1) Did I understand the problem? Yes 
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? 2 Strings
	 *    What is the expected output? true/false
	 *    Do I have constraints to solve the problem? 
	 *    	Should I consider the cases or not? No
	 *    Do I have all informations to go to next step!! Yes
	 *    How big is your test data set will be? Smaller
	 *    
	 *  2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		No - Can I break down the problem into sub problems?
	 * 			 1) If the length not matching -> not a Anagram
	 * 			 2) Try to find count of character occurence 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 			1) Think using List !!
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * 		Yes - What are those?
	 * 		No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * 		Then, explain either both or the best (depends on the time)
	 * 
	 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * 		Approach 2: Write down the options and benefits and code the best 
	 * 
	 * 7) Start always with Psuedo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set 
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */
	
	// Brute Force Algorithm !! 
	
	@Test
	public void example1() {
		String s1 = "listen";
		String s2 = "silent";
		boolean anagram = isAnagram(s1, s2);
		Assert.assertEquals(true, anagram);
	}
	
	@Test
	public void example2() {
		String s1 = "Listen ";
		String s2 = "Silent ";
		boolean anagram = isAnagram(s1, s2);
		Assert.assertEquals(false, anagram);
	}
	
	@Test
	public void example3() {
		String s1 = "ABCD";
		String s2 = "CBA";
		boolean anagram = isAnagram(s1, s2);
		Assert.assertEquals(false, anagram);
	}
	
	@Test
	public void example4() {
		String s1 = "AABB";
		String s2 = "AAAB";
		boolean anagram = isAnagram(s1, s2);
		Assert.assertEquals(false, anagram);
	}
	
	/*
	 * Psuedocode
	 * 0) If length not same, return false
	 * 1) Take the string input and covert to characters []
	 * 2) Push the characters into a list
	 * 3) Compare both
	 * 
	 */
	
	private boolean isAnagram(String s1, String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) // this is good 
			return false;
		
		List<Character> l1 = new ArrayList<>(); // Mandatory 
		List<Character> l2 = new ArrayList<>();

		for (int i = 0; i < s2.length(); i++) {
			l1.add(s1.charAt(i));
			l2.add(s2.charAt(i));
		}
		
		Collections.sort(l1); // O[logN]
		Collections.sort(l2);
		
		// List -> String
		// Compare String

		if(l1.equals(l2))
			return true;
		else
			return false;		
		
	}
	
	

}
