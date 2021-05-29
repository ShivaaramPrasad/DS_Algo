package weekTwo.homeWork.copy;

import java.util.Arrays;

import org.junit.Test;

/*
write a program to move all the positive numbers to end.
Input: [4,-1,9,0,2,-4,5]
Output: [-1,0,-4,4,9,2,5]
*/

public class MovePositive {

	@Test
	public void example1() {
		int[] nums = { 4, -1, 9, 0, 2, -4, 5 };
		//movePositiveToEnd(nums);
		movePosMaintainOrder(nums);
	}

	private void movePositiveToEnd(int[] nums) {
		int pos = 0, neg = 0;

		while (neg < nums.length) {
			if (nums[neg] <= 0) {
				int temp = nums[pos];
				nums[pos++] = nums[neg];
				nums[neg++] = temp;
			} else
				neg++;
		}

		System.out.println(Arrays.toString(nums));
	}

	private void movePosMaintainOrder(int[] nums) {
		int len = nums.length;
		int neg = 0, left = 0;
		int pos = len - 1, right = len - 1;
		int[] output = new int[len];

		while (neg < len && pos >= 0) {
			if (nums[neg++] <= 0)
				output[left++] = nums[neg - 1];
			if (nums[pos--] > 0)
				output[right--] = nums[pos + 1];
		}

		System.out.println(Arrays.toString(output));
	}
}
