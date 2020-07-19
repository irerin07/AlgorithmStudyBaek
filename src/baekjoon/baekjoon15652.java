package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon15652 {
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
        if (apply != 0 && result[apply-1] > i) {
          continue;
        }
        result[apply] = i;
        nextPermitation(apply+1);
      }
    }
  }

}