package baekjoon;

import java.util.Scanner;

public class Q2446 {
	//별 찍기-9
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값: ");
		int num = sc.nextInt();
		int num2=0;
		int max=2*num-1;
		boolean on = true;
	
		for(int m=1;m<=2;m++) {
			if(on==true) {
				for(int i=1; i<=num;i++) {
					for(int j=1;j<=(2*num-1);j++) {
						if(j<=num2) {
							System.out.print(" ");
						}else {
							if(j>max) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}	
						}	
					}
					System.out.println();
					num2++;
					max--;
				}
				on = false;
				num2=num2-2;
				max=max+2;
			}else {
				for(int i=1;i<=num-1;i++) {
					for(int j=1;j<=(2*num-1);j++) {
						if(j<=num2) {
							System.out.print(" ");
						}else {
							if(j>max) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
							
						}	
						
					}
					System.out.println();
					num2--;
					max++;
				}	
				
			}
			
		}
			
	}

}
