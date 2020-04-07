package baekjoon;

import java.util.Scanner;

public class Q2869 {
	//달팽이는 올라가고 싶다.
	public static void main(String[] args) {

		//낮 + , 밤 - , 정상 멈춤.
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int day=0;
		boolean change =true;
		int go=0;
		
		while(true) {
			if(change==true) {
				day++;
				if(go==V) {
					break;
				}else {
					go+=A;
				}
				
				
				change=false;
			}else {
				if(go==V) {
					break;
				}else {
					go-=B;
				}
				
				change=true;
			}
			
			
		}
		
		System.out.println(day);
		
	}

}
