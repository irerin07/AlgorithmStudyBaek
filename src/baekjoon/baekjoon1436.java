package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int s = 0;

        while(n > 0) {
            s++;
            if (String.valueOf(s).contains("666")) {
                n--;
            }
        }
        bw.write(String.valueOf(s));
        bw.flush();
        br.close();
        bw.close();

    }
}
