package baekjoon;

import java.util.Scanner;

public class Q1085 {
	//직사각형에서 탈출
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();   //가로
		int h = sc.nextInt();	//세로
		
		int min = Math.min(Math.min(w-x, x),Math.min(h-y,y));
		
		System.out.println(min);
		
		
	}

}
