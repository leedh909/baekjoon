package baekjoon;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		//OX퀴즈
		Scanner sc = new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		
		
		String b;
		String[] arr= new String[a];
		for(int i=0;i<a;i++) {
			b=sc.next();
			arr[i]=b;	
		}
		
		for(int i=0; i<a;i++) {
			int sum=0;
			int num=0;
			String[] arr2 = new String[arr[i].length()];
			for(int j=0; j<arr2.length;j++) {
				arr2[j]=Character.toString(arr[i].charAt(j));
				if(arr2[j].equals("O")) {
					num++;
				}else {
					num=0;
				}
				sum=sum+num;		
			}	
			System.out.println(sum);	
		}
		
		
		
	
	}

}
