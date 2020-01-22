package baekjoon;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		//숫자의 개수
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		int sum;
		int[] number = new int[10];
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum= a*b*c;
		
		int n=0;
		int temp;
		temp=sum;
		
		while(temp!=0) {
			n++;
			temp= temp/10;
		}
		
		int[] e_num= new int[n];
		int z= (int)Math.pow(10, n);
		int i=0;
		
		while(sum>0) {
			e_num[i]= sum/z;
			sum = sum%z;
			z=z/10;
			i++;
		}
		for(int j=0;j<e_num.length;j++) {
			if(e_num[j]==0) {
				number[0]++;
			}else if(e_num[j]==1) {
				number[1]++;
			}else if(e_num[j]==2) {
				number[2]++;
			}else if(e_num[j]==3) {
				number[3]++;
			}else if(e_num[j]==4) {
				number[4]++;
			}else if(e_num[j]==5) {
				number[5]++;
			}else if(e_num[j]==6) {
				number[6]++;
			}else if(e_num[j]==7) {
				number[7]++;
			}else if(e_num[j]==8) {
				number[8]++;
			}else{
				number[9]++;
			}
		}
		for(int j=0; j<number.length;j++) {
			System.out.println(number[j]);
		}
		
		
		
		
		

	}

}
