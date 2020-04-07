package baekjoon;

import java.util.Scanner;

public class Q1193 {
	//분수찾기
	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		int count=0;
		int add=1;
		int a=0,b=0;
	
		while(true) {
			if(num>(add*(add+1)/2)) {
				count+=add;
				add++;
			}else {
				break;
			}
				
		}	
		if(add%2==0) {
			a=1; b=add;
			int m= count-num+1;
			a-=m;
			b+=m;		
			System.out.println(a+"/"+b);
			
		}else {
			a=add; b=1;
			int m= count-num+1;
			a+=m;
			b-=m;
			System.out.println(a+"/"+b);
		}
		
	}

}
