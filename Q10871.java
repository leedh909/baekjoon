package baekjoon;

import java.util.Scanner;

public class Q10871 {
//X보다 작은 수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int b,c,d;
		b= sc.nextInt();
		d= sc.nextInt();
		
		int[] a = new int[b];
		for(int i=0; i<b;i++){
			c= sc.nextInt();
			a[i] = c;
			if(a[i]<d) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
