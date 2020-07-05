package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon15651 {
    static int N;
    static int M;
    static int[] result;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[N];
        sb = new StringBuilder();

        nextPermitation(0);
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();

    }

    static void nextPermitation(int apply) {
        if(apply == M) {
            for(int i = 0; i < M; i++) {
                sb.append(result[i]+" ");
            }
            sb.append("\n");
        }else {
            for(int i = 1; i <= N; i++) {
                result[apply] = i;
                nextPermitation(apply+1);
            }
        }
    }

}