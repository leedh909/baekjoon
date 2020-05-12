package baekjoon;

import java.util.Scanner;

public class Q7568 {
	//덩치
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[][] arr = new int[num][2];
		
		for(int i=0;i<num;i++) {
			
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		
		for(int i=0;i<num ;i++) {
			
			int count =1;
			for(int j=0;j<num;j++) {
				
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					
					count++;
					
				}
				
				
			}
			System.out.print(count+" ");
			
			
		}

	}

}
