package baekjoon;

import java.util.Scanner;

public class Q2581 {
	//소수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 M , N");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int large=Math.max(num1, num2);
		int small=Math.min(num1, num2);
		
		int[] arr = new int[large-small+1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=small+i;		
		}
		
		int total=0;
		int min=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int count=0;
			
			for(int j=1; j<=arr[i]; j++) {
				
				if(arr[i]%j==0) {
					count++;
				}
				
				
			}
			if(arr[i]!=1 && count<=2) {
				total+=arr[i];
				if(min==0) {
					min=arr[i];
				}else {

					min=Math.min(min, arr[i]);
				}
			}
			
		}
	
		if(total==0) {
			min =-1;
			System.out.println(min);
		}else {
			System.out.println(total);
			System.out.println(min);
		}
		
		
		
		
	}

}
