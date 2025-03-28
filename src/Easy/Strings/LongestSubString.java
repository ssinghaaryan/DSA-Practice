package Easy.Strings;

import java.util.HashSet;

public class LongestSubString {
	
	public static void main(String[]args) {
	
		String str = "aabcabcbb";
		int start = 0, end = 0, max = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(end < str.length()) {
		if(!set.contains(str.charAt(end))) {
			set.add(str.charAt(end));
			end++; //Moving end pointer when adding new character
			max = Math.max(set.size(), max);
		} else {
			set.remove(str.charAt(start));
			start++; //Moving start pointer when duplicated are found.
		}
	}
		System.out.println(max);
	}
}
