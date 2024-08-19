package Easy.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = scn.next();
		
		System.out.println("Enter String 2");
		String s2 = scn.next();
		
		System.out.println(isAnagram(s1, s2));
		
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		
		if(str1.length() != str2.length()) {
			return false;
		} else {
			
			char chArr1[] = str1.toLowerCase().toCharArray();
			char chArr2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			
			return Arrays.equals(chArr1, chArr2);
			
		}
		
	}

}
