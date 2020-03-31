package baekjoon;

import java.util.Scanner;

public class Q2523 {
	//별 찍기-13
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수 입력: ");
		int num = sc.nextInt();
		int max=num;
		boolean on = true;
		
		for(int i=1;i<=(2*num-1);i++) {
			
			if(on == true) {
				for(int j = 1;j<=i;j++) {
					System.out.print("*");
					if(j==i) {
						System.out.println();
						j++;
					}				
			
				}
				if(i==num) {
					on = false;
				}
			}
			else {
				for(int j = max-1;j>=1;j--) {
					System.out.print("*");
					if(j==1) {
						max--;
						System.out.println();
						j--;
					}				
			
				}
			}
							
		}
		
		
	}

}
