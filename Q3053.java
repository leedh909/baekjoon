package backjoon;

import java.util.Scanner;

public class Q3053 {
	//택시 기하학
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름: ");
		int r = sc.nextInt();
		
		System.out.printf("유클리드 기하학 넓이: %.6f \n",(r*r*Math.PI) );
		System.out.printf("택시 기하학 넓이: %.6f",(2.0*r*r));
		
	}

}
