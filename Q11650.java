package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11650 {
	//좌표 정렬하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하라");
		int num = sc.nextInt();
		int[][] point = new int[num][2];
		
		for(int i=0;i<num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			point[i][0] = x;
			point[i][1] = y;
		}
		
	}
}






















