package baekjoon;

import java.util.Scanner;

public class Q4948 {
	//베르트랑 공준
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		do{
			num = sc.nextInt();
			if(num==0) {
				return;
			}
			int big = 2*num;
			int tcount=0;
			
			for(int i=num+1; i<=big;i++) {
				int count=0;
				for(int j=1; j<=i;j++) {
					if(i%j==0) {
						count++;
					}
				}			
				if(count<=2) {
					tcount++;
				}
			}
			System.out.println(tcount);
		}while(true);
		
		
		
	}

}
