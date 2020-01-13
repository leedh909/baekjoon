package baekjoon;

import java.io.*;
import java.util.*;

public class Q15552 {
//빠른 A+B
	//BufferedReader
	//BufferedWrite
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int a, b;
		for( int i=0; i< num; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b+"\n");
							
		}
		bw.flush();
		br.close();
		bw.close();
	
	}
}
