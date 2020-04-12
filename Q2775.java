package baekjoon;

import java.util.Scanner;

public class Q2775 {
	//부녀회장이 될테야
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("진행 횟수: ");
		int T = sc.nextInt();
		
		for(int i = 0;i<T;i++) {
			System.out.print("층수:");
			int k = sc.nextInt();
			System.out.print("호수:");
			int n= sc.nextInt();
			int[][] arr = new int[k+1][n];
			
			for(int j=0;j<arr.length;j++) {
				
				
				for(int z=0;z<arr[j].length;z++) {
				
					if(j==0) {
						arr[0][z]=z+1;
					}else if(z==0) {
						arr[j][z]=1;
					}else {
						arr[j][z]=arr[j][z-1]+arr[j-1][z];	
					}
				}
			}

			System.out.println("거주민 수:"+arr[k][n-1]);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
