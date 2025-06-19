package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awesome accasion." + " " + "This has never happened before";
		
		//This is to count each character
		Map<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for (char character:characters) {
			Integer number = occurances.get(character);
			
			if (number == null) {
				occurances.put(character, 1);
			}
			else {
				occurances.put(character, number + 1);
			}
		}
		
		System.out.println(occurances);
		
		
		//This is to count each word
		Map<String, Integer> stringOccurances = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for (String word:words) {
			Integer number = stringOccurances.get(word);
			
			if (number == null) {
				stringOccurances.put(word, 1);
			}
			else {
				stringOccurances.put(word, number + 1);
			}
		}
		
		System.out.println(stringOccurances);
	}

}
