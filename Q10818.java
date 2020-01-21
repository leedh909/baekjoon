package baekjoon;

import java.util.*;

public class Q10818 {

	public static void main(String[] args) {
		//최소, 최대
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("배열의 크기를 입력해주세요 : ");
		a=sc.nextInt();
		int max, min; 
		
		
		int array[] = new int[a];
		
		for(int i=0;i<a;i++) {
			b=sc.nextInt();
			array[i]= b;			
		}
		max = array[0];
		min = array[0];
		
		for(int j=1;j<a;j++) {
			if(max<array[j]) {
				max = array[j];
			}
			if(min>array[j]) {
				min = array[j];
			}
		}
		System.out.println(min+" "+max);		

	}

}
