package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152_1 {
	//단어의 개수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
	
//		String[] arr = str.split(" ");
//		int count = arr.length;
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i].equals(" ")) {
//				count--;
//			}
//		}
//		System.out.println(count);
		
		
		StringTokenizer strToken=new StringTokenizer(str," ");
		System.out.println(strToken.countTokens());
		
	}

}
