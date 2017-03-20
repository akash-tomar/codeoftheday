package CodingNinjas;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonFactors {
	
	public static ArrayList<Integer> getFactors(int currentNum) {
		if(currentNum==1) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		boolean dividable = false;
		for(int i=2;i<=currentNum;i++) {
			if(currentNum%i==0) {
				ans.add(i);
				currentNum = currentNum/i;
				dividable = true;
				break;
			}
		}
		if(!dividable) {
			ans.add(currentNum);
			return ans;
		}
		ArrayList<Integer> getList = getFactors(currentNum);
		ans.addAll(getList);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
//		ArrayList<Integer> list1=getFactors(m);
//		ArrayList<Integer> list2=getFactors(n);
//		for(int ch:list1) {
//			System.out.print(ch+" ");
//		}
//		System.out.println();
//		for(int ch:list2) {
//			System.out.print(ch+" ");
//		}
		
		int divisor = 1;
		int ans=0;
		while(true) {
			if(divisor>m || divisor>n) {
				break;
			}
			if(m%divisor==0 && n%divisor==0) {
				ans++;
			}
			divisor++;
		}
		System.out.println(ans);
//		int point1 = 0;
//		int point2 = 0;
//		int ans = 0;
//		while(true) {
//			if(point1>=list1.size() || point2>=list2.size()) {
//				break;
//			}
//			if(list1.get(point1)==list2.get(point2)) {
//				ans++;
//				point1++;
//				point2++;
//			} else if(list1.get(point1)<list2.get(point2)) {
//				point1++;
//			} else if(list1.get(point1)>list2.get(point2)) {
//				point2++;
//			}
//		}
//		System.out.println(ans+1);
	}
}
