package baekjoon;

import java.util.Scanner;

public class Q2941_1 {

	public static void main(String[] args) {
		//크로아티아 알파벳
		
		    Scanner sc = new Scanner(System.in);
		    String croa=sc.nextLine().trim();
		    sc.close();
		    String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		    int result=0;
		    
		    for(int i=0;i<arr.length;i++) {
		        if(croa.contains(arr[i])) {
		            croa=croa.replaceAll(arr[i]," ");
		            }
		        }   
		    System.out.println(croa.length());
		  		
	}

}
