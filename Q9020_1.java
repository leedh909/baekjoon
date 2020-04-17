package baekjoon;

import java.util.Scanner;

public class Q9020_1 {
	//골드바흐의 추측 //아직 미완성
	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
	      int i=0;
	      int a=0,b=0; //소수의 곱 
	      int n = 0;
	      int z=input.nextInt();
	      for(int j=0;j<z;j++)
	      {
	      n=input.nextInt();
	      for(a=n/2,b=n/2;;a++,b--)
	      {
	         n=a+b;
	         if(check(a)&&check(b))
	         {
	            System.out.println(b+" "+a);
	            break;
	         }
	      }
	      }
	      //1. 입력을 받는다
	      
	      //2 . 입력받은 값을 소수의 곱으로 표현한다.
	      
	      
	      
	   }
	   public static boolean check(int n)
	   {
	      //자기 자신과 1 말고는 나누어 져서는 안됨.
	      
	      
	      for(int i=2;i<=n/2;i++)
	      {
	         if(n%i==0)
	            return false;
	      }
	      return true;
	   }
}