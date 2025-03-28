package Easy.Strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramStringHashMap {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) return false;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map.get(ch) == null) {
				map.put(ch, 1);
			} else {
			map.put(ch, map.get(ch) + 1);
		}
	}
		
		for(int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if(!map.containsKey(ch)) return false;
			
			map.put(ch, map.get(ch) - 1);
			if(map.get(ch) == 0) map.remove(ch);
		}
		
		return map.isEmpty();
		
	}
	
	public static void main(String[]args) {
		
		String str1 = "left car";
		String str2 = "felt arr";
		
		if(isAnagram(str1, str2)) {
			System.out.println("Anagram");;
		} else {
			System.out.println("Not Anagram");
		}
		
	}

}
