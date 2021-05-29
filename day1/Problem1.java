package day1;

import org.junit.Test;

import junit.framework.Assert;

public class Problem1 {
	/*
	 * 1) Did I understand the problem? Yes or No !!
	 * 		-> If No, Ask the person to provide more detail with example(s)
	 * 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?
	 *    What is the expected output?
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    How big is your test data set will be?
	 *
	 *  2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great, is there an alternate?
	 * 		No - Can I break down the problem into sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * 		Yes - What are those?
	 * 		No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * 		Then, explain either both or the best (depends on the time)
	 * 
	 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * 		Approach 2: Write down the options and benefits and code the best 
	 * 
	 * 7) Start always with Psuedo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set 
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */
	
	// Brute Force Algorithm !! 
	
	
	@Test // Positive
	public void example1() {
		int[] numbers ={3,4,1,5,3,2};
		int k =3;
		int occCount=getOccCount(numbers,k);
		Assert.assertEquals(2, occCount);
	}
	
	@Test // Edge
	public void example2() {
		
		int[] numbers ={1,2,1,2,1,2};
		int k =3;
		int occCount=getOccCount(numbers,k);
		Assert.assertEquals(0, occCount);

		
	}
	
	@Test // Negative
	public void example3() {
		
		int[] numbers ={};
		int k =3;
		int occCount=getOccCount(numbers,k);
		Assert.assertEquals(0, occCount);

		
	}
	
	/*
	 * Psuedocode:
	 * 
	 * Itrate array from left to right (one at a time) //foor loop 
	 * 
	 * take the specific  number from the array index  //a[1]
	 *
	 *Compare the expected value 
	 *
	 *if matches --> add a count (new Varible=> 0 )
	 * 
	 * else no action
	 * 
	 * at end -->return count
	 */
	
	
	private int getOccCount(int[] numbers, int k)
	{
		
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++)
			
		{
			if (numbers[i]==k)
				count++;
		}
		return count;

	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
