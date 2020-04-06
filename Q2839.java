package baekjoon;

import java.util.Scanner;

public class Q2839 {
	//설탕배달
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 설탕의 무게: ");
		int num=sc.nextInt();
		
		
	
		if(num%5 ==0) {
			System.out.println(num/5);
			return;
		}else {
			int a = num/5;
			for(int i=a;i>0;i--) {
				int temp = num-(i*5);
				if(temp%3==0) {
					System.out.println(i+(temp/3));
					return;
				}
			}
		}
		if(num%3==0) {
			System.out.println(num/3);
		}else {
			System.out.println(-1);
		}
		return;
	}
 
}
