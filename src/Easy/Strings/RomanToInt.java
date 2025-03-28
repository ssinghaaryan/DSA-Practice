package Easy.Strings;

import java.util.HashMap;

public class RomanToInt {
	
	public static void main(String[]args) {
		
		String str = "MCMXCIV";
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(i + 1 < str.length() && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
				result -= map.get(str.charAt(i));
			} else {
				result += map.get(str.charAt(i));
			}
		}
		System.out.println(result);
	}
}
