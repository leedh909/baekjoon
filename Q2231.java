package baekjoon;

import java.util.Scanner;

public class Q2231 {
	//분해합
	
	static int N;
	static int sum;
	static int constructor;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();

		for(int i=1;i<=N;i++) {
			if(getSum(i) ==N) {
				constructor = i;
				break;
			}
		}
		System.out.println(constructor);
		
	}
	
	public static int getSum(int N) {
		String strN = String.valueOf(N);
		
		sum = N;
		
		for(int i=0; i<strN.length();i++) {
			sum += strN.charAt(i) -'0';
		}
		
		return sum;
	}
	
}
