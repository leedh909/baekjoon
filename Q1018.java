package baekjoon;

import java.util.Scanner;

public class Q1018 {
	//체스판 다시 칠하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] arr = new char[n][m];
		
		for(int i=0;i<n;i++) {
			String str = sc.next(); 
			arr[i]=str.toCharArray();
		}
		
		int mincount=64;
		
		for(int i=0; i< m-8+1;i++) {
			int count=0;
			int count2=0;
			for(int j=0;j<8;j++) {
				
				if(count2==0) {
					for(int k=i;k<i+7;k++) {
						
						if(arr[j][k]=='B') {
							
							if(arr[j][k+1]=='B') {
								count++;
							}					
							
						}else if(arr[j][k]=='W') {
							
							if(arr[j][k+1]=='W') {
								count++;
							}
				
						}
						
						
					}
				}else {
					if(arr[j-1][i]=='B') {
						if(arr[j-1][i]==arr[j][i]) {
							count+=4;
							arr[j][i]='W';
						}else {
							for(int k=i;k<i+7;k++) {
								
								if(arr[j][k]=='B') {
									
									if(arr[j][k+1]=='B') {
										count++;
									}					
									
								}else if(arr[j][k]=='W') {
									
									if(arr[j][k+1]=='W') {
										count++;
									}
						
								}
								
								
							}
						}
						
					}
					else if(arr[j-1][i]=='W') {
						if(arr[j-1][i]==arr[j][i]) {
							count+=4;
							arr[j][i]='B';
						}else {
							for(int k=i;k<i+7;k++) {
								
								if(arr[j][k]=='B') {
									
									if(arr[j][k+1]=='B') {
										count++;
									}					
									
								}else if(arr[j][k]=='W') {
									
									if(arr[j][k+1]=='W') {
										count++;
									}
						
								}
								
								
							}
						}
					
					}
	
					
				}
				
				
				count2++;
				
			}
			if(mincount>(count/2)) {
				mincount=(count/2);
			}
			
			
		}
		
		System.out.println(mincount);

		
		
		
		
		
		
	}

}
