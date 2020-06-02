package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1181 {
	//단어 정렬
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String arr[][] = new String[num][2];
		
		for(int i=0;i<num;i++) {
			arr[i][0]=sc.next().toLowerCase();
			arr[i][1]=String.valueOf(arr[i][0].length());
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				
				 if(o1[1]==o2[1]) {
					 return o1[0].compareTo(o2[0]);
				 }
				 return o1[1].compareTo(o2[1]);
		
			}
		});
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i][0]);
	
		}
		
	}

}
