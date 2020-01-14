package baekjoon;

import java.util.Scanner;

public class Q2439 {
//별 찍기-2
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j<=a-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();				
			
		}
		
	
	}
}
