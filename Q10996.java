package baekjoon;

import java.util.Scanner;

public class Q10996 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		boolean on =true;
		
		for(int i=0; i<2*num; i++) {
			if(on==false) {
				for(int j=1;j<=num;j++) {
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				on = true;
				System.out.println();
			}else {
				for(int j=1;j<=num;j++) {
					if(j%2!=0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				on = false;
				System.out.println();
			}
		}
		
	}

}
