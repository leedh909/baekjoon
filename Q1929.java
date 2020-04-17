package baekjoon;

import java.util.Scanner;

public class Q1929 {
	//소수 구하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = Math.max(num1, num2);
		int small = Math.min(num1, num2);
		
		int[] iarr = new int[big-small+1];
		for(int i=0;i<iarr.length;i++) {
			iarr[i]=small+i;
		}
		
		for(int i=0; i<iarr.length;i++){
			int count=0;
			for(int j=1;j<=iarr[i];j++) {
				if(iarr[i]%j==0) {
					count++;
				}
			}
			if(iarr[i] !=1 && count<=2) {
				System.out.println(iarr[i]);
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
