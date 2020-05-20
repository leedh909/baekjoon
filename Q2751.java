package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2751 {
	//수 정렬하기2
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<num;i++) {
			int num2 = sc.nextInt();
			arr.add(num2);
			arr.sort(null);
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
