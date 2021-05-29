package weekTwo.homeWork.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
Find all subarrays in the input array matching the target.
Example1:
Input:[1,7,4,3,4,1,2,5,1]
Target: 7
Output:
1,1
2,3
3,4
4,6
6,7
*/

public class FindSubArrays {

	@Test
	public void example1() {
		int[] nums = { 1, 7, 4, 3, 4, 1, 2, 5, 1 };
		int target = 7;
		returnSubArrays(nums, target);
	}

	private void returnSubArrays(int[] nums, int target) {
		List<String> output = new ArrayList<String>();

		int start = 0, end = 0;
		int sum = 0;
		for (; start < nums.length; start++) {
			while (sum < target && end < nums.length)
				sum += nums[end++];

			if (sum == target)
				output.add(Arrays.toString(new int[] { start, end-1 }));

			sum -= nums[start];
		}

		System.out.println(output);
	}
}
