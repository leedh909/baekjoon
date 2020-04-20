package backjoon;

import java.util.Scanner;

public class Q4153 {
	//직각삼각형
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		int max;
		int a,b;
		
		while(true){
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			
			max=Math.max(num1,Math.max(num2, num3));
			
			if(num1==0 && num2 ==0 &&num3==0) {
				break;
			}else {
				if(max !=num1) {
					
					a= num1;
					if(max != num2) {
						b = num2;
					}else {
						b = num3;
					}
		
				}else {
					a = num1;
					b = num2;
				}
				
				if((max*max) == ((a*a)+(b*b))) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}		
		
		}
		
		
	}

}
