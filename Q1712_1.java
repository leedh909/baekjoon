package baekjoon;

import java.util.Scanner;

public class Q1712_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt(); //고정비용
		int b =sc.nextInt(); //가변비용
		int c =sc.nextInt(); //노트북가격
	
		int result;
		
		if(c<=b) result=-1;
		else result = a/(c-b)+1;
		System.out.println(result);
		
			
			
	}

}
