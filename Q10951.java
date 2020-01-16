package baekjoon;

import java.util.Scanner;

public class Q10951 {
//A+B-4
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		while(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
			
		}

	}

}
//무한루프를 돌기때문에 백준에서 런타임에러가 나온다. 
//그래서 hasNextInt() 라는 메소드를 사용하여 직접 EOF(end of file)를 입력하면 멈추게 해주어야한다. 
//Scanner sc = new Scanner(System.in);
//
//int a, b;
//while(true){
//	a = sc.nextInt();
//	b = sc.nextInt();
//	System.out.println(a+b);
//	
//}