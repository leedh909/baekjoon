package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989_1 {
	//수 정렬하기3
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int[] nums = new int[10000+1];

        for (int i = 0; i < input; i++) {
            int num = Integer.parseInt(br.readLine());
                nums[num] += 1;
        }

        for (int i = 0; i < 10000 + 1; i++) {
            if(nums[i] != 0) {
                for (int j = 0; j < nums[i]; j++) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
