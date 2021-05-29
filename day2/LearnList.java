package day2;

import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// List -> Dynamic Array
		// List -> Can grow or shrink by size
		// List -> Can allow duplicate values
		// You can pick the value using index !!
		// List (By default) -> maintains the insertion order
		List<String> oldCompanies = new LinkedList<>();
		oldCompanies.add("TestLeaf");
		oldCompanies.add("TechM");
		oldCompanies.add("Prodapt");
		oldCompanies.add("CTS");

		for (String each : oldCompanies) {
			System.out.println(each);
		}
		
		List<String> currentCompanies = new LinkedList<>();
		oldCompanies.add("TestLeaf");
		currentCompanies.add("Hexaware");
		oldCompanies.add("Amazon");
		oldCompanies.add("Zoho");

		if(oldCompanies.equals(currentCompanies)) {
			System.out.println("None of them moved");
		} else {
			System.out.println("Some of them moved");
		}
	}

}
