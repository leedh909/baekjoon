package baekjoon;

import java.util.Scanner;

public class Q1011 {
	//Fly me to the Alpha Centauri
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력횟수:");
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			
			System.out.print("현재위치: ");	
			int num1 = sc.nextInt();
			System.out.print("목표위치: ");
			int num2 = sc.nextInt();
			int count =1;
			int length = num2-num1;
			int dis = 0;
			while(length>dis) {
				count++;
				dis+=count/2;
			}
			System.out.println(count-1);
			
			
		}
		
	}

	//int형이 표현 가능한 최대값(2^31-1)일 수도 있는데
	//dis가 이 범위를 초과하여 오버플로우가 발생해서 비교연산이 제대로 진행되지 않을 경우가 발생함.
	//그래서 long으로 바꾸어서 실행해야한다.
	
	
	
	
}
