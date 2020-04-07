package baekjoon;

import java.util.Scanner;

public class Q2292 {
	//벌집
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("N 숫자 입력: ");
		int num=sc.nextInt();
		
		System.out.println(Q2292.ncount(num)+1);
		
		
	}
	
	public static int ncount(int num) {
	
		int i=1;
		int ncount =0;
		
		while(true) {
			
			if(num<=i) {
				break;
			}
			ncount++;
			i+=6*ncount;
			
			
		}
		return ncount;
		
	}

}
