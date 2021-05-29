package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class FindSingle {
	private int findSingle(int[] data) {
		
		// Hash Map + Hash Set
		// Hash Set -> Add + Remove
		// XOR
		
		int result = 0;
		for (int i : data) {
	        result ^= i;
		}
		return result;
	}
	@Test
	public void example1() {
		int[] data = {2,2,1};
		int num = findSingle(data);
		System.out.println(num);
	}
	
	@Test
	public void example2() {
		int[] data = {4,1,2,1,2};
		int num = findSingle(data);
		System.out.println(num);
	}

	@Test
	public void example3() {
		int[] data = {1};
		int num = findSingle(data);
		System.out.println(num);
	}
	
}
