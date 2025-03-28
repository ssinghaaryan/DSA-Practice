package Easy.Strings;

//Count number of vowel strings in a range.
public class CountVowelsString {
	
	public static int countVowel(String[] words, int left, int right) {
		
		int count = 0;
		for(int i = left; i <= right; i++) { // start traversing from provided start index(left) to end index(right)
			
			char s = words[i].charAt(0); // word's starting character
			char e = words[i].charAt(words[i].length() - 1); // word's end character
			
			if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
				if(e == 'a' || e == 'i' || e == 'e' || e == 'o' || e == 'u') {
					count++;
				}
			}
		}
		return count;
	
	}
	
	public static void main(String[]args) {
		
		String[] words = {"are","amy","us"};
		int left = 0, right = 2;
		
		System.out.println(countVowel(words, left, right));
		
		
	}

}
