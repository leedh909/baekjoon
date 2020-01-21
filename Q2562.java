package baekjoon;

import java.util.*;

public class Q2562 {

	public static void main(String[] args) {
		//최댓값
		Scanner sc = new Scanner(System.in);
		
		
		int max;
		int number =1;
		
		
		int array[] = new int[9];
		
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();;			
		}
		max = array[0];
		
		for(int j=1;j<array.length;j++) {
			if(max<array[j]) {
				max = array[j];
				number = j+1;
			}
			
		}
		System.out.println(max);
		System.out.println(number);

	}

}
