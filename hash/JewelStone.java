package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JewelStone {
	
	private int getStoneCount(String jewels, String stones) {
		int count = 0;
		Map<Character, Integer> jewelStones = new HashMap<Character, Integer>();
		for (int i = 0; i < stones.length(); i++) {
			jewelStones.put(stones.charAt(i), jewelStones.getOrDefault(stones.charAt(i),0)+1);
		}
		for (int i = 0; i < jewels.length(); i++) {
			count += jewelStones.getOrDefault(jewels.charAt(i),0);
		}
		return count;
	}

	@Test
	public void example1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}
	
	@Test
	public void example2() {
		String jewels = "z";
		String stones = "ZZ";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}

	@Test
	public void example3() {
		String jewels = "abc";
		String stones = "k";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}
	
}
