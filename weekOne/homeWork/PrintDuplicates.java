package weekOne.homeWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PrintDuplicates {
	/*
	 * 1) Did i understand the problem? 
	 *    Parameters
	 *      -> What is the input for this problem? interger array
	 *      -> What will be the output for this problem? set,list,array
	 *      -> is there any constraints? no
	 *      -> Do i have all informants to go the next step? yes
	 *      -> How big is the test data? small
	 *      
	 * 2) Test data set -yes
	 *    -> Minimum of 3 data sets
	 *    -> Positive, Negative and Edge case scenario
	 *    -> Validate the test data with interviewer
	 *    
	 * 3) Do i know to solve it? - yes
	 * 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution? - list
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
		int[] nums= {1,3,8,3,11,5,6,4,7,6,7,7};
		System.out.println(findDuplicates(nums));
	}
	
	@Test
	public void example2() {
		int[] nums= {1,2,3,4,5};
		System.out.println(findDuplicates(nums));
	}
	
	@Test
	public void example3() {
		int[] nums= {7,7,7};
		System.out.println(findDuplicates(nums));
	}
	
	//Pseudo Code
	/*
	 *initialize 2 set one for unique and another one for duplicate
	 *iterate thorugh each element in the given array
	 *	we'll keep on adding it to the unique set
	 *	if current element is already present in the unique set, we'll check the duplicate set
	 *we'll remove it from unique set and add it to the duplicate set
	 *finally return the duplicate set 
	 */
	
	public String findDuplicates(int[] nums) {
		
		if(nums.length<2)
			return "[]";
		
		Set<Integer> unique=new HashSet<>();
		Set<Integer> duplicate=new HashSet<>();
		
		for (int eachElement : nums) {
			if(!unique.add(eachElement) || duplicate.contains(eachElement)) {
				unique.remove(eachElement);
				duplicate.add(eachElement);
			}
		}
		
		return duplicate.toString();
	}
}
