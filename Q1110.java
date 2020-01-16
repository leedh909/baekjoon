package baekjoon;

import java.util.Scanner;

public class Q1110 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int number;
		int g=0;

		a=sc.nextInt();
		number =a;
		do {
			number= (number%10)*10+((number/10)+(number%10))%10 ;
			g=g+1;
		}
		while(a!=number);
		System.out.println(g);

	}

}
