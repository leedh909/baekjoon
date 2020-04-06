package baekjoon;

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {
		//크로아티아 알파벳
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String str= sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			count++;
			switch(str.charAt(i)) {
			case 'c':
				if((str.charAt(i+1)=='='||str.charAt(i+1)=='-')) {
					i++;
				}
				break;
			case 'd':
				if(str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') {
					i+=2;
				}else if(str.charAt(i+1)=='j') {
					i++;
				}
				break;
				
			case 'l':
			case 'n':
				if(str.charAt(i+1)=='j') {
					i++;
				}
				break;
			case 's':
			case 'z':
				if(str.charAt(i+1)=='=') {
					i++;
				}
				break;
			
			}
			
		}
		System.out.println(count);
		
		
	}

}
