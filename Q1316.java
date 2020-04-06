package baekjoon;

import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		//그룹 단어 체커

		Scanner sc = new Scanner(System.in);
		
		int countword = sc.nextInt();
		int answer=countword;
		
		for(int i=0; i< countword ;i++){
			
			String str = sc.next().toLowerCase();
			boolean[] checker = new boolean[26];
			
			
			for(int j=1; j<str.length();j++) {
				
				if(str.charAt(j-1) != str.charAt(j)) {
					if(checker[str.charAt(j)-97]==true) {
						answer--;
						break;
					}
				checker[str.charAt(j-1)-97]=true;
				}
			}
		
		}
		System.out.println(answer);
		
	
	}

}
