package day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class GetUnique {

	
	/*Find unique characters in a given string.
	Input: Testleaf
	Output: a, s, f, l*/
	
	/*
	 * 1) Did I understand the problem? Yes
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? String
	 *    What is the expected output? Char Array
	 *    Do I have constraints to solve the problem? Case Insensitive
	 *    Should I maintain the order? Not needed !!
	 *    Do I have all informations to go to next step!!
	 *    How big is your test data set will be? Small
	 *    
	 *  2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great, is there an alternate?
	 * 		No - Can I break down the problem into sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
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
	
	//@Test // Positive
	public void example1() {
		String s1 = "Testleaf";
		char[] output = {'s','l','a','f'};
		getUnique(s1);
		//Assert.assertEquals(unique, output);
	}
	
	@Test // Edge
	public void example2() {
		String s1 = " Babu $#$ ";
		char[] output = {'a','u','#'};
		getUnique(s1);

	}
	
	@Test // Negative
	public void example3() {
		String s1 = "aaaa";
		char[] output = {};
		getUnique(s1);
	}
	
	@Test 
	public void example4() {
		String s1 = "abc";
		char[] output = {'a','b','c'};
	}
	
	// Use Set to solve !!
	
	/*
	 * Psuedocode:
	 * 
	 * 1) Take the string, convert to lowercase and convert to character array !!
	 * 2) Create a set 
	 * 2) Iterate from left to right
	 * 		a) Check if the given character is already in the set -> (yes) remove it 
	 * 		b) Not in the set -> add it !!
	 * 3) Finally print or send it back !!
	 */
	
	private void getUnique(String s1) {
		char[] c1 = s1.toLowerCase().toCharArray();
		Set<Character> unique = new HashSet<>();
		Set<Character> dups = new HashSet<>();
		for (Character c : c1) {
			if(unique.contains(c) || dups.contains(c) ) {
				unique.remove(c);
				dups.add(c);
			} else {
				unique.add(c);
			}
		}
		System.out.println(unique);
	}
	
	
	
	
	
	
	
	
	
	
}
