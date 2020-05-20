package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		int[] check = new int[8001];
		
		for(int i =0;i<num;i++) {
			
			int num2 = sc.nextInt();
			arr.add(num2);
			check[arr.get(i)+4000]++;
			
		}
		int maxIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<8001 ; i++){
            if(check[maxIndex] < check[i]){
                maxIndex = i;
                list.clear();
            }
            else if(check[i]!=0 && check[i]==check[maxIndex]){
                list.add(i-4000);
            }
        }
		
		
		
		int sum =0;
		for(int i=0;i<arr.size();i++) {
			sum = sum + arr.get(i);		
		}
		System.out.println((int)Math.round((double)sum/arr.size()));
		arr.sort(null);
		
		int mid = arr.size()/2;
		System.out.println(arr.get(mid));
		
		if(list.size()!=0)
            System.out.println(list.get(0));
        else
            System.out.println(maxIndex-4000);
		
		System.out.println((arr.get(arr.size()-1)-arr.get(0)));
		
		
		

	}

}
