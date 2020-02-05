package baekjoon;

import java.util.Scanner;

public class Q4673 {

	public static void main(String[] args) {
		//셀프 넘버
		boolean[] arrNumber = new boolean[10001];
		
				
		for(int i=1;i<arrNumber.length;i++) {
			int sum = d(i);
			if(sum<=10000) {
				arrNumber[sum]=true;
			}
		}
		for(int i=1; i<arrNumber.length;i++) {
			if(!arrNumber[i]) {
				System.out.println(i);
			}
		}
	
		
		
		
	}
	public static int d(int n) {
		int sum = n;
		while (n >0) {
			sum = sum+ n%10;
			n= n/10;
			
		}
		
		return sum;
	}
	

}
