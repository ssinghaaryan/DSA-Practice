package Easy.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String strArr[]) {
		
		Arrays.sort(strArr);
		String str1 = strArr[0];
		String str2 = strArr[strArr.length - 1];
		
		int index = 0;
		while(index < str1.length()) {
			
			if(str1.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}
		}
		return index == 0 ? "" : str1.substring(0, index);
	}
	
	public static void main(String[]args) {
		
		String strArr[] = {"car", "cat", "cactus"};
		System.out.println("The LCP of the string array is: " + longestCommonPrefix(strArr));
		
	}

}
