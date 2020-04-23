package baekjoon;

import java.util.Scanner;

public class Q10872 {
	//팩토리얼
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(pac(num));
		
		
	}
	
	public static int pac(int num) {
		
		int num2=num;
		
		
		if(num==1 || num==0) {
			num2=1;
			return num2;
		}else {
			num--;
			return num2=num2 * pac(num);
		}
		
		
		
	}

}
