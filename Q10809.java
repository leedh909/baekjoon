package baekjoon;

import java.util.Scanner;

public class Q10809 {
	//알파벳찾기
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
         String input = sc.next();
         
         for (char c = 'a' ; c <= 'z' ; c++)
                System.out.print(input.indexOf(c) + " ");
	}

}
