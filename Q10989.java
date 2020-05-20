package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10989 {
	//수 정렬하기3
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			
			int num2 = sc.nextInt();
			arr.add(num2);
			
		}
		arr.sort(null);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
