package sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ExactSum {



	@Test
	public void example2() {

		int[] numbers = {1,1,1,3,6,1,1};
		int target = 7;
		int[] sum = exactSum(numbers, target);
		System.out.println(Arrays.toString(sum));
	}

	@Test
	public void example3() {

		int[] numbers = {8,11,14,23};
		int target = 7;
		int[] sum = exactSum(numbers, target);
		System.out.println(Arrays.toString(sum));
	}

	/*
	 * Psuedocode:
	 * 1) Iterate from left to right (outer loop)
	 * 2) Take the current index value as sum
	 * 		a) If the current sum matches target -> return index !!
	 * 		b) If the current sum is greater than target -> continue to next data !!
	 * 3) Iterate to next set of values (inner loop)
	 * 		a) Add those to the sum 
	 * 		b) If the sum is less than target -> continue to next data 
	 * 		c) If the sum is greater than target -> break
	 * 		d) If the sum matches to the target -> return the outer and inner index
	 * If none matches, throw exception or return -1 indices
	 * 
	 */

	@Test
	public void example1() {

		int[] numbers = {1,7,4,3,1,2,1,5,1};
		int target = 7;
		int[] sum = solveUsingHash(numbers, target);
		System.out.println(Arrays.toString(sum));
		System.out.println();
	}

	/*
	 * Time Complexity: < O[N2]
	 * Space Complexity: O[1]
	 * 
	 */

	private int[] exactSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) { // outer loop
			int current = numbers[i];
			if(current == target) return new int[] {i, i};
			if(current > target)  continue;
			for (int j = i+1; j < numbers.length; j++) {
				current += numbers[j];
				if(current < target)  continue;
				if(current > target)  break;
				if(current == target) return new int[] {i, j};
			}
		}
		return new int[] {-1, -1};
	}

	/*
	 * 
	 *  Start with first element 
		If the sum is less than the desired sum, slide to the next element [Grow]
		Again, sum that and check if it is lesser, equal or greater
		If it is lesser, add the next element to slide [Grow]
		If it is greater, than shrink the last element on the left [Shrink]
		If it is equal, you got it and again do both Grow and Shrink [Slide]

	 */


	/*
	 * HashMap - Do we wanted to solve it with O[N]
	 * 
	 * Map<Key,Value>
	 * 
	 * 
	 */

	private int[] solveUsingHash(int[] numbers, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		// Initialize the first value with negative number
		map.put(0, -1);

		// What is the sum so far?
		int sum_so_far = 0;

		for (int i = 0; i < numbers.length; i++) { // O[N]
			sum_so_far += numbers[i];			
			int diff = sum_so_far - target;			
			if(map.containsKey(diff)) {
				System.out.println("Found the sub array : {"+(map.get(diff)+1)+" , "+ i +"}");
			}
			map.put(sum_so_far, i);
		}


		throw new RuntimeException("There is no matching indices");
	}





















}
