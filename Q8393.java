package baekjoon;

import java.util.Scanner;

public class Q8393 {
//합
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		int sum =0;
		for(int i=1;i<=a;i++) {
				sum = sum+i;			
		}
		System.out.println(sum);
	
	}
}
