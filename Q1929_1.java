package backjoon;

import java.util.Scanner;

public class Q1929_1 {
	//소수 구하기
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		
		int[] nums = new int[(int) (N+1)];
		for(int i=2; i<=N; i++) {
			nums[i] = i;
		}
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(nums[i] == 0) {
				continue;
			}
			
			int temp = i;
			for(int j = i+1; j<=N; j++) {
				if(j % temp == 0) {
					nums[j] = 0;
				}
			}
		}
		
		for(int i = M; i<=N; i++) {
			if(nums[(int) i] != 0) {
				System.out.println(nums[(int) i]);
			}
		}
		
	}

}
