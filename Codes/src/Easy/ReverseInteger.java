package Easy;

import java.util.Scanner;

public class ReverseInteger {
	
	public static int reverseInteger(int num) {
		
		int rev = 0;
		
		while(num > 0) {
			
			int digit = num % 10;
			rev = (rev * 10) + digit;
			
			// This is needed if the integer's value gets out of range and doesn't give garbage value as output.
			if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
				return 0;
			}
			num /= 10;
		}
		return rev;
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Integer");
		int n = scn.nextInt();
		
		System.out.println(reverseInteger(n));
		
	}

}
