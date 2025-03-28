package Easy.Strings;

import java.util.Scanner;

public class PalindromeString {
	
	// 1. Simple Method
//	public static void main(String[]args) {
//		
//		Scanner scn = new Scanner(System.in);
//		
//		System.out.println("Enter the String");
//		String str = scn.next();
//		
//		String orgStr = str; // Creating a copy of the original string as it would be modified.
//		String revStr = "";
//		
//		for(int i = str.length() -1; i >= 0; i--) {
//			
//			revStr = revStr + str.charAt(i);
//			
//		}
//		
//		if(revStr.equals(orgStr))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
//		
//	}
	
	// 2. Two Pointer Method
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = scn.next();
		
		if(isPalindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
	
	public static boolean isPalindrome(String str) {
		
		
		int i = 0, j = str.length() - 1;
		
		while(i < j) {
			
			if(str.charAt(i) != str.charAt(j))
				return false;
			
			i++;
			j--;
			
		}
		
		return true;
		
	}

}
