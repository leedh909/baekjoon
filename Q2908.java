package baekjoon;

import java.util.Scanner;

public class Q2908 {
	//상수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num1=sc.next();
		String num2=sc.next();
		
		char[] iarr=new char[3];
		char[] iarr2=new char[3];
		char[] temp = new char[3];
		char[] temp2 = new char[3];
		
		String res ="";
		String res2 ="";
		
		
		for(int i=0; i<num1.length();i++) {
			temp[i] = num1.charAt(i);
		}
		
		for(int i=0;i<num1.length();i++) {
			iarr[i] = temp[temp.length-i-1];
			res=res+iarr[i];
		}
		
		for(int i=0; i<num2.length();i++) {
			temp2[i] = num2.charAt(i);
		}
		
		for(int i=0;i<num2.length();i++) {
			iarr2[i] = temp2[temp2.length-i-1];
			res2=res2+iarr2[i];
		}
		
		int sang1=Integer.parseInt(res);
		int sang2=Integer.parseInt(res2);
		
		if(sang1 > sang2) {
			System.out.println(sang1);
		}else if(sang1 < sang2) {
			System.out.println(sang2);
		}else {
			System.out.println("같다.");
		}
		
		
	}

}
