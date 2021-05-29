package weekOne.homeWork;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReturnIndex {
	/*
	 * 1) Did i understand the problem? 
	 *    Parameters
	 *      -> What is the input for this problem? 
	 *      -> What will be the output for this problem? 
	 *      -> is there any constraints? 
	 *      -> Do i have all informants to go the next step? 
	 *      -> How big is the test data?
	 *      
	 * 2) Test data set
	 *    -> Minimum of 3 data sets
	 *    -> Positive, Negative and Edge case scenario
	 *    -> Validate the test data with interviewer
	 *    
	 * 3) Do i know to solve it?
	 * 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution?
	 *    -> No, Solve with the known solution
	 *    
	 * 6) If alternate solution found -> Find the O notation 
	 *     -> Explain either or the best one depends on time
	 *     -> Approach 01 : Starts with worst(Brute force)
	 *     -> Approach 02: Write the options and benefits of it 
	 *     -> Always start from worst to best
	 *     
	 * 7) Proceed with pseudocode 
	 * 
	 * 8) Implement code in editor
	 * 
	 * 9) Test against data set
	 * 
	 * 10) Debug if it fails    
	 */
	
	@Test
	public void example1() {
		int[] nums= {1,3,5,6};
		int target=5;
		System.out.println(findIndex(nums,target));
	}
	
	@Test
	public void example2() {
		int[] nums= {6,9,10,12,15};
		int target=5;
		System.out.println(findIndex(nums,target));
	}
	
	@Test
	public void example3() {
		int[] nums= {1,3,5,6};
		int target=2;
		System.out.println(findIndex(nums,target));
	}
	
	@Test
	public void example4() {
		int[] nums= {-5,-4,-2,-1};
		int target=1;
		System.out.println(findIndex(nums,target));
	}
	
	//Pseudo Code
	/*
	 * 
	 */
	
	public int findIndex(int[] nums,int target) {
		
		return nums.length;
	}
}
