package two_pointers;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	@Test
	public void example1() {
		int[] nums = {4,0,2,0,0,1};
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));
	}

	@Test
	public void example2() {
		int[] nums = {0,0,0,1,1,1};
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));

	}

	@Test
	public void example3() {
		int[] nums = {1,2,3,4,5};
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));

	}
	
	/*
	 * Time Complexity: O[N]
	 * Space Complexity: O[N] => O[1]
	 * 
	 * 
	 */
	
	private int[] moveZeroes(int[] nums) {
		int[] output = new int[nums.length]; // Additional array of same size Space Complexity: O[N] 
		int j=0;
		for (int i = 0; i < output.length; i++) { // Time Complexity : O[N]
			if(nums[i] != 0) {
				output[j++] = nums[i];
			}
		}
		return output;
	}
	
	/*
	 * Is Right Index having non-zero ?  
			Yes – then swap with Left Index
			Move Left Index
		Move Right Index
	 * 
	 * Time Complexity: O[N]
	 * Space Complexity: O[1]
	 * 
	 */
	
	// a = 2 b = 3 => a = a+b = 5 b = 5-b = 2 => a = a-b = 3
	
	private int[] twoPointer(int[] nums) {
		int left = 0, right = 0;
		while(right < nums.length) {
			if(nums[right] != 0) {
				// swap left and right
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
			right++;
		}
		return nums;
	}
	
	
	
	
	
	
	
	
	
	
	



}
