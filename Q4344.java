package baekjoon;

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {
		//평균은 넘겠지
		Scanner sc = new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		int b,c;
		String[] avg = new String[a];
	
		
		
		for(int i=0;i<a;i++) {
			float sum=0;
			int count=0;
			b= sc.nextInt();
			int[] arr=new int[b];
			for(int j=0; j<b; j++) {
				c=sc.nextInt();
				arr[j]=c;
				sum= sum+ arr[j];
			}
			for(int k=0;k<b;k++) {
				if(arr[k]>((float)sum/b)) {
					count++;
				}
			}
			avg[i]=String.format("%.3f", (float)count/b*100);
		}	
		
		for(int i=0;i<a;i++) {
			System.out.println(avg[i]+"%");
		}
	
	}

}
