package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11650 {
	//좌표 정렬하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] point = new int[num][2];
		
		for(int i=0;i<num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			point[i][0] = x;
			point[i][1] = y;
		}
		
		int tmp[] = new int[2];
		
		for(int i=0;i<num-1;i++) {
			
			for(int j=i+1;j<num;j++) {
				
				if(point[i][0]>point[j][0]) {
					tmp = point[i];
					point[i]=point[j];
					point[j]=tmp;
				}else if(point[i][0]==point[j][0]) {
					
					if(point[i][1]>point[j][1]) {
						tmp = point[i];
						point[i]=point[j];
						point[j]=tmp;
					}

				}
	
			}

		}
		for(int i=0;i<num;i++) {
			System.out.println(point[i][0]+" "+point[i][1]);
		}
	}
}






















