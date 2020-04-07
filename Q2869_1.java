package baekjoon;

import java.util.Scanner;

public class Q2869_1 {
	//달팽이는 올라가고 싶다.
	public static void main(String[] args) {

		//낮 + , 밤 - , 정상 멈춤.
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int day=(V-B)/(A-B);
		if((V-B)%(A-B) !=0) day++;
		System.out.println(day);
		
	}

}
