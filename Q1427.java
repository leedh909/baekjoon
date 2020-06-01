package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1427 {
	//소트인사이드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ArrayList sort = new ArrayList(); 
		
		for(int i=0; i<String.valueOf(num).length();i++) {
			char a = String.valueOf(num).charAt(i);
			sort.add(a);
		}
		sort.sort(null);
		Collections.reverse(sort);
		for(int i=0;i<sort.size();i++) {
			System.out.print(sort.get(i));
		}
	}

}
