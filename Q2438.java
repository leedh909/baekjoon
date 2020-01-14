package baekjoon;

import java.util.Scanner;

public class Q2438 {
//별 찍기-1
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
}
