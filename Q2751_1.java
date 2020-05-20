package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751_1 {
	//수 정렬하기2
	public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int inputcount = Integer.parseInt(br.readLine());
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for (int i = 0; i < inputcount; i++){
          arr.add(Integer.parseInt(br.readLine()));
      }
      Collections.sort(arr);
      for (int i = 0; i < arr.size(); i++){
          System.out.println(arr.get(i));
      }
  }

}
