package Easy.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scn.next();
		
		boolean status = true;
		
		Map<Character, Integer> map = new HashMap<>();
		
		//String to get each char
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.get(ch) == 1) { // non-repeating
				System.out.println("First non-repeating character: " + ch);
				status = true;
				break;
			}
		}
		if(!status) System.out.println("no non-repeating character");
	}

}


// l -> 1, e -> 1, f -> 1, t -> 1