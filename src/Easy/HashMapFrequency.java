package Easy;
import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {
	
	public static void main() {
		String str = "Aryan Singh";
		
		HashMap <Character, Integer> freqMap = new HashMap<>();
		
//		for(int i = 0; i < name.length(); i++) {
//			int count = 0;
//			char character = name.charAt(i);
//			map.put(character, count);
//		}
		
		for(char ch: str.toCharArray()) {
			if(ch != ' ') {
				freqMap.put(ch, freqMap.get(ch) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: freqMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
  	
}