package baekjoon;

import java.util.Scanner;

public class Q14681 {
	//사분면 고르기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점(x,y) 입력하세요.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>=0&&b>=0) {
			System.out.println(1);
		}else if(a>=0&&b<0) {
			System.out.println(4);
		}else if(a<0&&b>=0) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}

	}

}
