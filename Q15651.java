package baekjoon;

import java.util.Scanner;

public class Q15651 {
	//N과 M(3)
	
	static int n,m;
	static int list[];
	
	static void dfs(int cnt) {
		
		if(cnt==m){
			for(int i=0;i<m;i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			return;
		}
		
		for(int i=1;i<=n;i++) {
			list[cnt]=i;
			dfs(cnt+1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		list = new int[m];
		dfs(0);
		sc.close();
		
		
	}

}
