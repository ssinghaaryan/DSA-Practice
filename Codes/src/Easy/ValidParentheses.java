package Easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid(String str) {
		
		if(str.length() % 2 != 0) return false;
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: str.toCharArray()) {
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if(ch == ')' && !stack.empty() && stack.peek() == '(') {
				stack.pop();
			} else if(ch == '}' && !stack.empty() && stack.peek() == '{') {
				stack.pop();
			} else if(ch == ']' && !stack.empty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}
 		return stack.isEmpty();
	}
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Parentheses String");
		String str = scn.next();
		
		System.out.println(isValid(str));
		
	}

}
