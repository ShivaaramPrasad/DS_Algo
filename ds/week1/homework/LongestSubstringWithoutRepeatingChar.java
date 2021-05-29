package ds.week1.homework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingChar {

	/*
	 * 1) Did i understand the problem? 
	 *    Parameters
	 *      -> What is the input for this problem? string
	 *      -> What will be the output for this problem? int
	 *      -> is there any constraints? consider only substring without duplicate characters
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
		String input="abcabcbb";
		System.out.println(returnMaxSubstringLength(input));
	}
	
	@Test
	public void example2() {
		String input="bbbbb";
		System.out.println(returnMaxSubstringLength(input));
	}
	
	@Test
	public void example3() {
		String input="pwwkew";
		System.out.println(returnMaxSubstringLength(input));
	}
	
	@Test
	public void example4() {
		String input="";
		System.out.println(returnMaxSubstringLength(input));
	}
	
	//Pseudo Code
	/*
	 * initialize a set
	 * use 2 for loops. 1st one for starting of the substring and 2nd one for the end of substring
	 * in the second loop, add the characters to the set. once we find the character already present 
	 * in the set, find the length of the substring and compare it with the previous length and break the loop
	 * finally return the max length of the substring
	 */
	private int returnMaxSubstringLength(String input) {
		if(input.length()==0)
			return 0;
		
		int maxLen=-1;
		Set<Character> set=new HashSet<>();
		
		for (int start = 0; start < input.length(); start++) {
			for (int end = start; end < input.length(); end++) {
				if(!set.add(input.charAt(end))) {
					maxLen=Math.max(maxLen, end-start);
					break;
				}
			}
			set.clear();
		}
		return maxLen;
		
	}
}
