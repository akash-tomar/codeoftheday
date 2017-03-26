package CodingNinjas;

import java.util.Scanner;

public class Codezen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		int i = 0;
		while(i<N){
		    if (i%2!=0) {
		        int j = 1;
		        while( j < N - 1 ){
		            if( A[j] > A[j+1]) {
		            	int temp = A[j];
		            	A[j]=A[j+1];
		            	A[j+1]=temp;
		            }
		            j = j + 2;
		        }
		    }

		    else {
		        int j = 0;
		        while( j <N - 1 ){
		            if (A[j] > A[j+1] ){
		                int temp = A[j];
		            	A[j]=A[j+1];
		            	A[j+1]=temp;
		            }
		            j = j + 2;
		        }
		    }

		    i = i + 1;
		}
		for(int k=0;k<N;k++) {
			System.out.print(A[k]+" ");
		}
	}

}
