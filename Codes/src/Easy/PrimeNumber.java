package Easy;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = scn.nextInt();
		
		if(isPrime(num))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num <= 1)
			return false;
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0)
				return false;
			
		}
		return true;
	}

}
