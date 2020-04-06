package baekjoon;

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt(); //고정비용
		int b =sc.nextInt(); //가변비용
		int c =sc.nextInt(); //노트북가격
	
		int count=0;
		

		while(true) {
			int x = a+ b*count;
			int y = c*count;
			int z = y-x;
			
			if(z>0) {
				break;
			}else {
				count++;
			}
		}
			
			
		System.out.println(count);	
			
		
			
			
	}

}
