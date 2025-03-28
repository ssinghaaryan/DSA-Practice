package Easy.Strings;

public class IsSubsequence {
	
	public static boolean isSubsequence(String s, String t) {
		
		if(s.length() == 0) return true; // s is of 0 length, so it is a substring of t.
		
		int i = 0, j = 0; // keeping i pointer at 0th index of s. j at 0th index of t.
		
		while(i < s.length() && j < t.length()) { 
			
			if(s.charAt(i) == t.charAt(j)) { // if same character at i & j, put both at next index.
				i++;
				j++;
			} else { // if not same characters, only put j at next index.
				j++;
			}	
		}
		if(i == s.length()) { // if i is at end of string s, means all chacters match with string t so return true.
			return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		
		System.out.println(isSubsequence("acb", "aebfcid"));
		
	}

}
