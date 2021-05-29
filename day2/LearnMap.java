package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// Map -> Dynamic Array [Two Dimension -> Key : Value]
		// Map -> Can grow or shrink by size
		// Map -> Can't allow duplicate values in Key
		// Map -> Key [Unique] | Value [Can have duplicates, Null]
		// Map -> Interface -> 3 Implementation Classes
		// HashMap (Hashing Algo -> Fastest)
		// TreeMap (Ascii Order -> Slowest)
		// LinkedHashMap (Retains the order of insertion)
		Map<String, Integer> employment = new HashMap<>();
		employment.put("Syntel", 3); // Entry -> Key + Value
		employment.put("HCL", 1);
		employment.put("Mercury", 2);
		employment.put("HP", 7);
		employment.put("TestLeaf", 5);
		
		int minTenure = Integer.MAX_VALUE;
		for (Entry<String, Integer> eachEmployment : employment.entrySet()) {
			//System.out.println(eachEmployment.getKey());
			//System.out.println(eachEmployment.getValue());
			Integer tenure = eachEmployment.getValue();
			minTenure = Math.min(tenure, minTenure);
		}
		System.out.println(minTenure);

	}

}
