package baekjoon;

import java.util.Scanner;

public class Q2675 {
	//문자열 반복
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();		
	
		for(int i =0;i<num;i++) {
			
			int num2=sc.nextInt();
			String s=sc.next();
			String s2="";
			for( int j=0;j<s.length();j++)
			{
				for(int z=0;z<num2;z++) {
					
					s2+=s.charAt(j);
				}
			}
			System.out.println(s2);
		}
	}
}
