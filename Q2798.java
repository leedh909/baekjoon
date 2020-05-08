package baekjoon;

import java.util.Scanner;

public class Q2798 {
	//블랙잭
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] iarr = new int[N];
		for(int i=0; i<iarr.length;i++) {		
			iarr[i]=sc.nextInt();		
		}
		
		
		int temp=0;
		int sum=0;
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=i+1;j<iarr.length;j++) {
				for(int k=j+1;k<iarr.length;k++) {
					
					temp=iarr[i]+iarr[j]+iarr[k];
					
					if(temp<=M&&temp>sum) {
						sum=temp;
					}
					
					
				}
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
