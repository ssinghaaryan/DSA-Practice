package Easy.Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringChar {

	public static void main(String[]args) {
		
		String str = "zbasdfrrrrccccvvvvacaa";
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		
		// Primary conditions
		int max = 0; // Storing character with max occurrences.
		char character = str.charAt(0); // Using very first character from String as default character with max occurrences, which will be updated parallelly.
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch) > max) {
				max = map.get(ch);
				character = ch; 	
			}
		}
		
		System.out.println("Max occuring character is: " + character);
		
	}
	   
}
