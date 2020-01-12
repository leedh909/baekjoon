package baekjoon;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b-45<0) {
			a= a-1<0? 23: a-1 ;
			b= 60 + (b - 45);
			System.out.println(a+" "+b);
		}else {
			b=b-45;
			System.out.println(a+" "+b);
		}
	
	}

}
