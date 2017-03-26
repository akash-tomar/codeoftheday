package CodingNinjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Triangles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		long[] pileA  = new long[a];
		for(int i=0;i<a;i++) {
			pileA[i]=s.nextLong();
		}
		int b = s.nextInt();
		long[] pileB  = new long[b];
		for(int i=0;i<b;i++) {
			pileB[i]=s.nextLong();
		}
		int c = s.nextInt();
		long[] pileC  = new long[c];
		for(int i=0;i<c;i++) {
			pileC[i]=s.nextLong();
		}
		
		int ans = 0;
		HashMap<String, Boolean> map = new HashMap<>();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<c;k++) {
					long temp1 = pileA[i];
					long temp2 = pileB[j];
					long temp3= pileC[k];
					ArrayList<Long> temp = new ArrayList<>();
					temp.add(temp1);
					temp.add(temp2);
					temp.add(temp3);
					if(!map.containsKey(temp.get(0)+""+temp.get(1)+""+temp.get(2))) {
						map.put(temp.get(0)+""+temp.get(1)+""+temp.get(2), true);
						if(isTriangle(temp.get(0),temp.get(1),temp.get(2))) {
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
	public static boolean isTriangle(long a,long b,long c) {
		if(a+b>c && b+c>a && c+a>b) {
			return true;
		}
		return false;
	}
 }
