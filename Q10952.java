package baekjoon;

import java.util.Scanner;

public class Q10952 {
//A+B-5
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a!=0||b!=0) {
				System.out.println(a+b);
			}else {
				break;
			}
			
		}

	}

}
//do while 문은 사용할 경우
//int a,b;
//
//
//do {
//	a=sc.nextInt();
//	b=sc.nextInt();
//	System.out.println(a+b);
//}while(a!=0 || b!=0);
//
//