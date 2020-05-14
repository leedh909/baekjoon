package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2750 {
	//수 정렬하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		ArrayList arr = new ArrayList();
		
		for(int i=0;i<num;i++) {
			
			arr.add(sc.nextInt());
			
		}
		arr.sort(null);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		
	}

}
