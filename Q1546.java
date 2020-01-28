package baekjoon;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		//평균
		Scanner sc = new Scanner(System.in);
	
		int a,b,max;
		float sum=0;
		a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i = 0; i<a;i++) {
			b=sc.nextInt();
			arr[i] = b;				
		}
		max=arr[0];
		for(int i =1;i<a;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0;i<a;i++) {
			sum= sum + (float)arr[i]/max*100;
		}
		System.out.println(sum/a);
	}

}
