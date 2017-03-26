package CodingNinjas;

import java.util.HashMap;
import java.util.Scanner;

public class FinalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		int[] arr = new int[n];
		String str="";
//		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			str+=(s.nextInt()+"");
		}
		for(int i=0;i<q;i++) {
			int choice = s.nextInt();
			if(choice==1) {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(countDistinct(str,a-1,b-1));
			} else {
				int a = s.nextInt();
				int b = s.nextInt();
				char ch = s.next().charAt(0);
				str = rotateArray(str,a-1,b-1,ch);
			}
		}
	}
	public static String rotateArray(String arr,int a, int b,char ch) {
		if(ch=='L') {
			String ans = arr.substring(0,a)+arr.substring(a+1,b+1)+arr.charAt(a)+arr.substring(b+1);
			return ans;
		} else {
			String ans = arr.substring(0,a)+arr.charAt(b)+arr.substring(a,b)+arr.substring(b+1);
			return ans;
		}
	}
	public static int countDistinct(String arr,int a,int b) {
		HashMap<Character, Boolean> map = new HashMap<>();
		int count = 0;
		for(int i=a;i<=b;i++) {
			if(!map.containsKey(arr.charAt(i))) {
				map.put(arr.charAt(i), true);
				count++;
			}
		}
		return count;
	}
}
