package Easy.Strings;

import java.util.Scanner;

public class ReverseWordsInString {
	
	public static String reverseWords(String str) {
		
		// 1. Create array of words from String
		String words[] = str.split("\\s+");
		// 2. Create a StringBuilder to add the words & spaces to.
		StringBuilder sb = new StringBuilder();
		
		//3. Iterate from the back of words array to get words in reverse order.
		for(int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine(); //Difference between scn.next() & scn.nextLine().
		System.out.println(reverseWords(str));
		
	}

}
