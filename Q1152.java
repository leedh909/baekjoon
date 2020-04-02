package baekjoon;

import java.util.Scanner;

public class Q1152 {
	//단어의 개수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		
		char[] carr=new char[str.length()];
		
		for(int i =0;i<str.length();i++) {
			carr[i]=str.charAt(i);
		}
		for(int i=0;i<carr.length;i++) {
			if(carr[i]==' ') {
				count++;
			}
		}
		System.out.println((count+1));
		

	}

}
