package baekjoon;

import java.util.Scanner;

public class Q2446_1 {
	//별 찍기-9
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		for (int i = 0; i < N; i++) {	// 1 ~ N
			 
			// 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
 
			// 별
			for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
				System.out.print("*");
			}
 
			System.out.println();
		}
 
		// 삼각형 코드
		for (int i = 0; i < N - 1; i++) {	// N+1 ~ 2N-1
        
			// 공백
			for (int j = 1; j < (N - 1) - i; j++) {	
				System.out.print(" ");
			}
 
			// 별
			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		
		
		
}

