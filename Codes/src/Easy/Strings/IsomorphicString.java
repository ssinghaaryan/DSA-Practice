package Easy.Strings;

import java.util.HashMap;

public class IsomorphicString {
	
	public static boolean isIsomorphic(String s, String t) { // s = foo, t = bar
		
		HashMap<Character, Character> mapST = new HashMap<Character, Character>();
		HashMap<Character, Character> mapTS = new HashMap<Character, Character>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(mapST.containsKey(ch1) && mapST.get(ch1) != ch2 || mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1) {
				return false;
			}
			mapST.put(ch1, ch2);
			mapTS.put(ch2, ch1);
		}
		return true;
	}
	
	public static void main(String[]args) {
		
		System.out.println(isIsomorphic("foo", "bar"));
		
	}

}
