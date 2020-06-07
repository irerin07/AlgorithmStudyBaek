package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] memo = new long[num+1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i <= num; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        System.out.println(memo[num]);

    }
}
