package shivaa_homework;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	@Test
	public void example1() {
		int[] nums = {4,0,2,0,0,1};
		System.out.println(method1(nums));
		System.out.println(method2((nums)));
	}

	@Test
	public void example2() {
		int[] nums = {0,0,0,1,1,1};
		System.out.println(method1(nums));
		System.out.println(method2((nums)));

	}

	@Test
	public void example3() {
		int[] nums = {1,2,3,4,5};
		System.out.println(method1(nums));
		System.out.println(method2((nums)));

	}
	
	/*
	 * 
	 * 
	 */
	
	private String method1(int[] nums) {
		int[] output = new int[nums.length];
		int index=0;
		
		for (int i:nums)
			if (i!=0)
				output[index++]=i;
		return Arrays.toString(output);
	
	}
	
	
	private int[] method2(int[] nums) {
		return new int[] {};
	}
	
	
	
	
	
	
	
	
	
	
	



}
