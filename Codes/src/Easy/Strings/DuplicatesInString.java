package Easy.Strings;

import java.util.Scanner;

public class DuplicatesInString {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scn.next();
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			String ch = "" + str.charAt(i);
			if(result.contains(ch)) {
				continue;
			}
			result += ch;
		}
		System.out.println(result);
	}

}
