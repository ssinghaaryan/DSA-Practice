package Easy.Strings;

public class FindDifference {
	
	public static char findDifference(String s, String t) {
		
		int total = 0;
		
		for(int i = 0; i < t.length(); i++) {
			total += t.charAt(i);
		}
		
		for(int i = 0; i < s.length(); i++) {
			total -= s.charAt(i);
		}
		return (char)total;
	}
	
	public static void main(String[]args) {
		
		System.out.println("The difference b/w strings is: " + findDifference("abzcdf", "fanbczd"));
		
	}

}
