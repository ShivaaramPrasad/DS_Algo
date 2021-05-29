package day1;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class TwoSum {
	
	
	/*2 Sum problem - Largest asked problem across world !!  

	Given an array of integers say nums and an integer say target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.


	Example:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]


	Explanation:
	nums[0] + nums[1] == 9, so we
	return [0, 1].


	Example:

	Input: nums = [2,2,2,5,4,1,3], target = 6
	Output: [3,3]

	Example:

	Input: nums = [-3,11], target = 8
	Output: [0,1]
*/
	/*
	 * 1) Did I understand the problem? Yes 
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? -> int[] -> +, - , zeros, dups & k (target)
	 *    What is the expected output? -> indices of the matching value
	 *    Do I have constraints to solve the problem? -> exact solution, cannot use same element (index) twice
	 *    Do I have all informations to go to next step!! yes
	 *    How big is your test data set will be? -> untold (simple)
	 *    
	 *  2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great, is there an alternate?
	 *  
	 * 5) Do I know alternate solutions as well? No
	 * 
	 * 		No - That is still fine, proceed to solve by what you know !!
	 * 
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
	
	@Test // Positive
	public void example1() {
		int[] numbers = {1,2,11,15,7};
		int k = 9; // 9 - (2) = 7
		int[] matchingIndices = getMatchingIndices(numbers, k);
		assertEquals(true, Arrays.equals(matchingIndices, new int[] {1,4}));
	}
	
	@Test // Edge
	public void example2() {
		int[] numbers = {2,-9,11,15,1};
		int k = 2; // 2 - (-9) = 11
		int[] matchingIndices = getMatchingIndices(numbers, k);
		assertEquals(true, Arrays.equals(matchingIndices, new int[] {1,2}));
	
	}
	
	@Test // Negative
	public void example3() {
	
		int[] numbers = {4,6,7,3,2};
		int k = 2;
		int[] matchingIndices = getMatchingIndices(numbers, k);
		assertEquals(true, Arrays.equals(matchingIndices, new int[] {0,0}));
		
	}
	
	/*
	 * Psuedocode:
		 * Traverse from left to right (one number at a time)
		 * Pick the value of the number and subtract that from the target (k)
			 *  Traverse from the next number to the right
			 *  If the difference value found by the traverse path, 
			 *  	get the index and stop the loop
			 *  Else continue until the end
			 * 
		 * Iterate the rest of the value until you find the matches
		 * If you find matches, we need the index (2 indices) !!
		 * return indices
	 */	
	private int[] getMatchingIndices(int[] numbers, int k) {
		int[] indices = new int[2];
		boolean bFound = false;
		for (int i = 0; i < numbers.length; i++) {
			int diff = k - numbers[i];
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j] == diff) {
					indices[0] = i;
					indices[1] = j;
					bFound = true;
					break;
				}
			}
			if(bFound) break;
		}
		return indices;
		
	}
	
	
	
	
	
	
	
	
	
}
