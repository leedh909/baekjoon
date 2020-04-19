package baekjoon;

import java.util.Scanner;

public class Q3009 {

	public static void main(String[] args) {
		//네 번째 점
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[4];
		int[] y = new int[4];
		
		int num1,num2;
		
		for(int i=0; i<3;i++) {
			num1=sc.nextInt();
			num2=sc.nextInt();
			x[i]=num1;
			y[i]=num2;
		}
		
		
		int x1 ,y1;
		if(x[0] != x[1]) {
			
			if(x[0] == x[2]) {
				x1=x[1];
				
			}else {
				x1=x[0];
			}
		}else {
			
			x1=x[2];
			
		}
		
		if(y[0] != y[1]) {
			
			if(y[0] == y[2]) {
				y1=y[1];
				
			}else {
				y1=y[0];
			}
		}else {
			
			y1=y[2];
			
		}
		
		System.out.println(x1+" "+y1);
		
		
		
	}

}
