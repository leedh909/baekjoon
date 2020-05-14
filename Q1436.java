package baekjoon;

import java.util.Scanner;

public class Q1436 {
	//영화감독 숌
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count=0;
		
		while(num>0) {
			count++;
			if(String.valueOf(count).contains("666")) {
				num--;
			}
			
		}
		System.out.println(count);
		
		//666 1666 2666 3666 4666 5666 다음은 6660 으로 바뀝니다.
	}

}
