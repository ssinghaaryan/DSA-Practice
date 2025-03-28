package Easy.Strings;

import java.util.Scanner;

public class ReverseWordsString {
	
	public static String reverseWord(String str) {
		
		String words[] = str.split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]); //add the individual words -> java is fun
			sb.append(" ");
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine();
		System.out.println(reverseWord(str));
		
	}

}
