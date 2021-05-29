package weekOne.homeWork;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CharOccurrences {
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
		String input="Welcome to automation";
		System.out.println(returnEachOccurrences(input));
	}
	
	@Test
	public void example2() {
		String input="word";
		System.out.println(returnEachOccurrences(input));
	}
	
	@Test
	public void example3() {
		String input="Automation";
		System.out.println(returnEachOccurrences(input));
	}
	
	@Test
	public void example4() {
		String input="";
		System.out.println(returnEachOccurrences(input));
	}
	
	//Pseudo Code
	/*
	 * 
	 */
	
	public Map<Character, Integer> returnEachOccurrences(String input) {
		Map<Character, Integer> output=new HashMap<>();
		
		return output;
	}
	
}
