package baekjoon;

import java.util.Scanner;

public class Q2577_1 {

	public static void main(String[] args) {
		//숫자의 개수
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		int[] number = new int[10];
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int sum=a*b*c;
		while(sum>0) {
			number[sum%10]++;
			sum=sum/10;
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		
		
		
		

	}

}
