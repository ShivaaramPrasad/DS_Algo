package two_pointers;

import java.util.Arrays;

import org.junit.Test;

public class ArrayIntersection {
	
	@Test
	public void example1() {
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {2,12};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}
	
	@Test
	public void example2() {
		int[] nums1 = {4,5,9};
		int[] nums2 = {4,4,8,9,9};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	
	}

	@Test
	public void example3() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {4,5,9,9};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}
	
	@Test
	public void example4() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {1,2,3};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}
	
	@Test
	public void example5() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}
	
	/*
	 * Bruteforce -> Traverse through both arrays (nested) 
	 * 			  -> Lowest size on the first loop, bigger -> second loop
	 * 			  -> If both matches, add that to the list
	 * 			  -> Do not take duplicates
	 * 			  -> O[N*M] Time + Space O[M] 
	 * 
	 * Two Pointer -> 
		left > right ->>> move right
		left < right ->> move left
		left reaches length and right reaches length 
	 */
	
	/*
	 * Two Pointer
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	    int i = 0, j = 0, k = 0;
	    while (i < nums1.length && j < nums2.length) {
	        if (nums1[i] < nums2[j]) {
	            ++i;
	        } else if (nums1[i] > nums2[j]) {
	            ++j;
	        } else {
	            nums1[k++] = nums1[i++];
	            ++j;
	        }
	    }
	    return Arrays.copyOfRange(nums1, 0, k);
	}
	
}
