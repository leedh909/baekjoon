package baekjoon;

import java.util.Scanner;

public class Q10039 {
	//평균 점수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int sum=0;

		for(int i=0;i<5;i++) {
			num=sc.nextInt();
			if(num<40) {
				num=40;
			}
			sum=sum+num;
		}
		
		System.out.println(sum/5);
		
		
	}

}
