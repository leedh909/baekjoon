package baekjoon;

import java.util.Scanner;

public class Q1978 {
	//소수 찾기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int total = 0;
		int[] arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			
			int count=0;
			
			for(int j=1; j<=arr[i]; j++) {
				
				if(arr[i]%j==0) {
					count++;
				}
				
				
			}
			if(arr[i]!=1 && count<=2) {
				total++;
			}
			
		}
		System.out.println(total);
	}

}
