package baekjoon;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		//한수 (어떤 양의 정수 X의 자리수가 등차수열을 이룬다는 의미.)
		//자릿수 xyz는 2y=x+z 이다.
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		int result = 0;
		
		
		if(a<100) {
			result=a;
			System.out.println(result);
		}else {
			result=99;
			for(int i=100;i<=a;i++) {
				int x,y,z;
				
				x= i/100;
				y= (i%100)/10;
				z= i%10;
				
				if(2*y==x+z){
					result=result+1;					
				}
				
			}
			System.out.println(result);
			
		}	
	}	
}
