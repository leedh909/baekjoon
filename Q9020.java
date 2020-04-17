package baekjoon;

import java.util.Scanner;

public class Q9020 {
	//골드바흐의 추측 //아직 미완성
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		
		
		for(int i=0; i<num;i++) {
			int num2= sc.nextInt();
			int[] arr= new int[num2];
			int check1=0, check2=100;
			int c=0;
			int sum=0;
			for(int j=0;j<num2;j++) {
				arr[j]=j+1;
			}
			
			for(int j=0;j<num2;j++) {
				int count=0;
				for(int k=1;k<=arr.length;k++) {
					if(arr[j]%k==0) {
						count++;
					}
				}
				if(arr[j]==1 || count>2) {
					arr[j]=0;
				}
		
			}
			for(int j=0;j<num2;j++) {
				if(arr[j] != 0) {
					for(int k=1;k<num2;k++) {
						
						sum=arr[j]+arr[k];
						if(sum==num2) {
													
							if(c==0&& check1==0 && check2==100) {
								check1=arr[j];
								check2=arr[k];
								c=check2-check1;
								
							}else {
								int temp=Math.abs(arr[k]-arr[j]);
								if(c>temp && c>=0) {
									check1=arr[j];
									check2=arr[k];
									c=check2-check1;
								}else if(c==temp) {
									continue;
								}
								
								
							}
							
							
							
							
						}
						
						
					}
				}
			}
			if(check2==0) {
				continue;
			}else {
				System.out.print(check1+" "+check2+"\n");
			}
		}
		
		
		
		
		
	}

}
