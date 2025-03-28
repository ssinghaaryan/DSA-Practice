package Easy.Strings;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String strArr[]) {
		
		String prefix = strArr[0];
		
		for(int i = 1; i < strArr.length; i++) {
			
			while(strArr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix.length() == 0) return "";
			}
		}
		return prefix;
	}
	
	public static void main(String[]args) {
		
		String strArr[] = {"car", "cat", "cactus"}; 
//		String strArr[] = {"flower", "flow", "flight"};
		System.out.println("The LCP is: " + longestCommonPrefix(strArr));
		
	}

}
