package baekjoon;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Q10870 {
	//피보나치 수5
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		List pibo = new ArrayList();
		
		pibo.add(0);
		pibo.add(1);
		for(int i=0;i<num;i++) {
			int sum=(int)(pibo.get(i))+(int)(pibo.get(i+1));
			pibo.add(sum);
		}
		
		System.out.println(pibo.get(num));
	}
	
	
}
