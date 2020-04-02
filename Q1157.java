package baekjoon;

import java.util.Scanner;

public class Q1157 {
	//단어 공부
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str =sc.nextLine().toUpperCase();
		
		char[] ch2=new char[26];
		int max =0;
		char result ='?';
		
		for(int i=0;i<str.length();i++) {
			ch2[str.charAt(i)-65]++;
			if(max<ch2[str.charAt(i)-65]) {
				max=ch2[str.charAt(i)-65];
				result=str.charAt(i);
			}else if(max== ch2[str.charAt(i)-65]) {
				result='?';
			}
		}
		
		System.out.println(result);
		
	}

}
