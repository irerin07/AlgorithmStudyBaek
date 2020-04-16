package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon1018_2 {
    public static int n = Integer.MAX_VALUE;
    public static char map[][];
    static String[] chessBoard = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
            "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//행
        int M = Integer.parseInt(st.nextToken());//열
        String[] input = new String[N];
        for(int i = 0; i < N; i++){
            input[i] = br.readLine();
        }

        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int cnt = 0;
                for(int k = 0; k < 8; k++){
                    //계산을 진행 할 위치의 값들을 임시로 받아옴
                    String temp = input[i + k].substring(j, j + 8);
                    for(int l = 0; l < 8; l++){
                        if(temp.charAt(l) == chessBoard[k].charAt(l)){
                            cnt++;
                        }
                    }
                }
                if(cnt >= 32) cnt = 64 - cnt;
                n = Math.min(n, cnt);
            }
        }
        bw.write(n + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
