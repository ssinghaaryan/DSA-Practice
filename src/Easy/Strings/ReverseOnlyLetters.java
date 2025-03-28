package Easy.Strings;

public class ReverseOnlyLetters {
	
	public static String reverseLetters(String s) {
		
		int start = 0, end = s.length() - 1; // put two pointers at start and end of string s.
		char ch[] = s.toCharArray(); 
		
		while(start < end) {
			
			if(!Character.isLetter(ch[start])) { // if char at index is not an English letter, jump to next index.
				start++;
			} else if(!Character.isLetter(ch[end])) { // if char at index is not an English letter, jump 1 index backwards.
				end--;
			} else { // if they match, swap them and move pointers forward and backward
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}
		return new String (ch); // convert the ch[] s to String.
	}
	
	public static void main(String[]args) {
		
		System.out.println(reverseLetters("java is the lang"));
		
	}

}
