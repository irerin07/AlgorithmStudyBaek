package baekjoon;

import java.io.*;

public class baekjoon2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 1; i <= n ; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n-i; j++) {
                sb.append(" ");
            }
            for(int j = 0; j < i*2-1; j++) {
                sb.append("*");
            }
            bw.write(String.valueOf(sb));
            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
