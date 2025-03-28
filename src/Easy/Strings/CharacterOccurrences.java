package Easy.Strings;
import java.util.HashMap;

public class CharacterOccurrences {
	
	public static void getCharCount(String str) {
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		char charArray[] = str.toCharArray();
		
		for(char c: charArray) {
			
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(str + ":" + charMap);
	}
	
	public static void main(String[]args) {
		
		getCharCount("java");
		getCharCount("test");		
	}

}


// java = j = 1, a = 2, v = 1
// test = t = 2, e = 1, s = 1
