package day1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FindSquares_Shivaa {
	
	/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

			Example 1:
			Input: nums = [-4,-1,0,3,10]
			Output: [0,1,9,16,100]


			Explanation: After squaring, the array becomes [16,1,0,9,100].
			After sorting, it becomes [0,1,9,16,100].

			Example 2:
			Input: nums = [-7,-3,2,3,11]
			Output: [4,9,9,49,121]

			[3,3,3,3,4]
			 
			Constraints: nums is sorted in non-decreasing order.

			Solve by BruteForce !!*/
	/*
	 * 1) Did I understand the problem? Yes 
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[]  -> non-decreasing order
	 *    What is the expected output? -> int[] -> non-decreasing order
	 *    Do I have constraints to solve the problem? ->  non-decreasing order
	 *    Do I have all informations to go to next step!! -> Yes
	 *    How big is your test data set will be? -> Smaller 
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
		int[] nums = {-4,-1,0,3,10};
		int[] squareAndSort = squareAndSort(nums);
		assertEquals(true, Arrays.equals(squareAndSort, new int[] {0,1,9,16,100}));
		
	}
	
	@Test // Edge
	public void example2() {
		int[] nums = {2,3,3,3,7};
		int[] squareAndSort = squareAndSort(nums);
		assertEquals(true, Arrays.equals(squareAndSort, new int[] {4,9,9,9,49}));
	}
	
	@Test // Negative
	public void example3() {
		int[] nums = {};
		int[] squareAndSort = squareAndSort(nums);
		assertEquals(true, Arrays.equals(squareAndSort, new int[] {}));
	}
	
	/*
	 * Psuedocode for brute force:
		 * Traverse through the input array, one at a time (for loop)
		 * Square the value of the given index (value*value)
		 * Store them in another array / Replace the value by the squared value (assignment)
		 * Finally, sort the array (Arrays.sort)
		 * Return the array return
	 * 
	 */
	private int[] squareAndSort(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			nums[i] = nums[i]*nums[i];
		//Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		return nums;
		
	}
	
	/*
	 * You created another additional array !! that is space issue !!
	 * Note: Try to minimize the number of variables, objects that you use !!
	 * Constraint: You are not allowed to sort using built-in
	 */
	private int[] squareAndSort1(int[] nums) {
		int[] nums1 = new int[nums.length]; // new array
		for (int i = 0; i < nums.length; i++)
			nums1[i] = nums[i]*nums[i];
		
		//Arrays.sort(nums);
		return nums1;
		
	}
	
	
	
	
	
	
	
	
}
