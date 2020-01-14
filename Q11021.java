package baekjoon;

import java.util.Scanner;

public class Q11021 {
//A+B-7
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int sum;
		int a,b,c;
		a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			b=sc.nextInt();
			c=sc.nextInt();
			sum =b+c;
			System.out.println("Case #"+i+": "+sum);	
		}
		
	
	}
}
