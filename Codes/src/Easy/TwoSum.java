package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	
	public static int[] twoSum(int[] num, int target) {
		
		for(int i = 0; i < num.length; i++) {
			for(int  j = i + 1; j < num.length; j++) {
				if(num[i] + num[j] == target) {
					int result[] = {i, j};
					return result;
				}
			}
		}
		return null;
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array");
		int n = scn.nextInt();
		
		int num[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		
		System.out.println("Enter target value");
		int target = scn.nextInt();
		
//		System.out.println("Elements are");
//		for(int i = 0; i < n; i++) {
//			System.out.println(num[i]);
//		}
		
		int result[] = twoSum(num, target);
		
		System.out.println(Arrays.toString(result));
		//The output [I@50c87b21 is the default string representation of the array in Java,
		//To get a human-readable output of the array elements, you should use Arrays.toString() to print the array.
		
	}

}
