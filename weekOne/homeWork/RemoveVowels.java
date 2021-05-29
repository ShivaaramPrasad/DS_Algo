package weekOne.homeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RemoveVowels {
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
		String input="youwillwinthis";
		System.out.println(removeVowels(input));
	}
	
	@Test
	public void example2() {
		String input="What Is Your Name?";
		System.out.println(removeVowels(input));
	}
	
	@Test
	public void example3() {
		String input="crypts";
		System.out.println(removeVowels(input));
	}
	
	@Test
	public void example4() {
		String input="Aaeiou";
		System.out.println(removeVowels(input));
	}
	
	//Pseudo Code
	/*
	 * 
	 */
	
	public String removeVowels(String input) {
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
		String output="";
		
		return output;
	}
}
