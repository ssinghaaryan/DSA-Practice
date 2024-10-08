package Easy.Strings;

public class ValidPalindrome {
	
	public static boolean isValidPalindrome(String s) {
		
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", ""); // the characters should not be -> a-z, A-Z, 0-9. negation -> ^. replace these with null -> "".
		int start = 0, end = s.length() - 1;
		
		while(start <= end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		
		System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
		
	}

}
