package Easy.Strings;

import java.util.Scanner;

public class RemoveDuplicatesInString {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scn.next();
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			String ch = "" + str.charAt(i); // using String for ch instead of char -> below contains function is for String.
			if(result.contains(ch)) {
				continue;
			}
			result += ch;
		}
		System.out.println(result);
	}

}
