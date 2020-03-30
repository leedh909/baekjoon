package baekjoon;

import java.util.Scanner;

public class Q5543 {
	//상근날드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int buger1=0, buger2=0, buger3=0;
		int drk1=0, drk2=0;
		int sum =0;
		
		buger1=sc.nextInt();
		buger2=sc.nextInt();
		buger3=sc.nextInt();
		drk1=sc.nextInt();
		drk2=sc.nextInt();
		
		if(buger1>buger2) {
			if(buger2>buger3) {
				sum=sum+buger3;
			}else {
				sum=sum+buger2;
			}
		}else {
			if(buger1>buger3) {
				sum=sum+buger3;
			}else {
				sum=sum+buger1;
			}
		}
		
		if(drk1>drk2) {
			sum=sum+drk2;
		}else {
			sum=sum+drk1;			
		}
		
		sum=sum-50;
		
		System.out.println(sum);
				
		
		
		
		
	}

}
