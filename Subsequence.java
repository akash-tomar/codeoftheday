package CodingNinjas;

import java.util.Scanner;
import java.util.Stack;

public class Subsequence {
	static int max = Integer.MIN_VALUE;
	public static void subsequence(String input,String stringSoFar) {
		if(input.length()==0) {
			if(isBalanced(stringSoFar)) {
				max = Math.max(max, stringSoFar.length());
			}
			return;
		}
		subsequence(input.substring(1), stringSoFar);
		subsequence(input.substring(1), stringSoFar+""+input.charAt(0));
	}
	public static boolean isBalanced(String str) {
		if(str.length()%2!=0) {
			return false;
		}
		String str1;
		String str2;
		str1=str.substring(0, str.length()/2);
		str2=str.substring(str.length()/2,str.length());
		
		int index = 0;
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str1.length();i++) {
			stack.push(str1.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			char ch = stack.pop();
			if(ch=='{' && str2.charAt(index)=='}') {
				
			} else if(ch=='[' && str2.charAt(index)==']') {
//				something++;
			} else if(ch=='(' && str2.charAt(index)==')') {
//				something++;
			} else {
				return false;
			}
			index++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		subsequence(str, "");
		System.out.println(max);
	}
}
