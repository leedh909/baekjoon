package baekjoon;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		//나머지
		Scanner sc = new Scanner(System.in);
	
		int[] num = new int[42];
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length;i++) {
			num[(arr[i]%42)]++;
		}
		
		int total=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				total++;
			}
		}
		System.out.println(total);

	}

}
