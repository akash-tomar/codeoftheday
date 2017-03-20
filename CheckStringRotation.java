package CodingNinjas;

import java.util.Scanner;

public class CheckStringRotation {
	public static int checkRotation(String original ,String rotated) {
		// Write your code here
		for(int i=0;i<original.length();i++) {
			char ch = original.charAt(0);
			String temp = original.substring(1)+ch;
			original = temp;
			if(rotated.equals(original)) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2  = s.next();
		System.out.println(checkRotation(str1, str2));
	}
}
