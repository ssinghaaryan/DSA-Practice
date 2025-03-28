package Easy.Strings;

public class ReverseVowels {
	
	public static String reverseVowel(String s) {
		
		char ch[] = s.toCharArray();
		int start = 0, end = s.length() - 1;
		
		while(start < end) {
			
			if(!isVowel(ch[start])) { // If the first character in the ch string is not a vowel.
				start++; // move pointer to next character.
			} else if(!isVowel(ch[end])) { // If the last character in the ch string is not a vowel.
				end--; // move pointer back.
			} else { // 
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}
		return String.valueOf(ch);
	}
	
	public static boolean isVowel(char ch) {
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		
		System.out.println(reverseVowel("holle"));
		
	}

}
