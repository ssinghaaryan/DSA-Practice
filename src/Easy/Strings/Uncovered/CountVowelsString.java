package Easy.Strings.Uncovered;

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
		
		String[] words = {"are","amy","u"}; 
		// 'are' is vowel string as starts with a & ends with e, 'amy' is not as ends with y & 'u' is as starts & ends with y.
		int left = 0, right = 2;
		
		System.out.println(countVowel(words, left, right));
		
		
	}

}
