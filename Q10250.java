package baekjoon;

import java.util.Scanner;

public class Q10250 {
	//ACM 호텔
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
			
		//T:입력개수
		//H:높이 ,W:가로,N:손님번호
		//"%02d" 라는 것은, 정수(%d)를 표현하되, 총 2자리로 나타내고, 앞의 빈자리는 0으로 채우라는 뜻입니다.
		for(int i=0; i<T;i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int count=1;
			char[][] hotel = new char[H][W];
			for(int j=0;j<hotel.length;j++) {
				for(int k=0;k<hotel[j].length;k++) {
					hotel[j][k]= ' ';
				}
			}
			
			for(int j=0;j<hotel.length;j++) {
				
				for(int k=0;k<hotel[j].length;k++) {
					if(count==N){
						System.out.printf("%d%02d \n",k+1,j+1);
						break;
					}
					if(k>hotel.length-1) {
						break;
					}else {
						hotel[k][j]=(char)count;
						count++;
					}
					
					
				}
				if(count==N){
					break;
				}

			}
			
			
			
		}
		
	}

}
