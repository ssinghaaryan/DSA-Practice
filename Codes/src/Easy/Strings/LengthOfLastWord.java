package Easy.Strings;

import java.util.Scanner;

public class LengthOfLastWord {
	
	public static int lastWord(String s) {
		
		int count = 0;
		String str = s.trim();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
//			if(str.charAt(i) == ' ') break;
//			
//			else count++;
			
			if(str.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scn.nextLine();
		
		System.out.println("Length of last word is: " + lastWord(s));
		
	}

}
