package Easy.Strings;

import java.util.Scanner;

public class PalindromeStrings {
	
	public static boolean isPalindrome(String str) {
		
		int start = 0, end = str.length() - 1;
		
		while(start < end) {
			
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
	}
		return true;
		
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scn.next();
		
		if(isPalindrome(str)) {
			System.err.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
	}

}
