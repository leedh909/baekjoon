package baekjoon;

import java.util.Scanner;

public class Q11720_1 {

	public static void main(String[] args) {
		//숫자의 합
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum =0;
		String b;
		
		b=sc.next();
		while(a!=b.length()) {
			b=sc.next();
			//숫자의 개수N이랑 입력된 숫자의 개수가 다르면 계속 실행
		}
		int c=Integer.parseInt(b);
		
		for(int i=1;i<=a;i++) {
			
			sum= sum+c/(int)Math.pow(10,a-i);
			c=c%(int)Math.pow(10,a-i);
			
		}
		System.out.println(sum);
			
	}	
}