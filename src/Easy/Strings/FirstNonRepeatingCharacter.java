package Easy.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.next();
		
		Map<Character, Integer> map = new HashMap<>();
		boolean status = true;
		
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
			
			if(map.get(ch) == 1) {
				System.out.println("First non-repeating character is: " + ch);
//				System.out.println("Duplicate character is: " + ch);
				status = true;
				break;
			}
			
		}
		
		if(!status) System.out.println("No non-repeating character present");
		
	}
}
