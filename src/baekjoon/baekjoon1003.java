package baekjoon;

import java.io.*;

public class baekjoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] zeroCount = new int[41];
        int[] oneCount = new int[41];

        zeroCount[0] = 1;
        oneCount[0] = 0;
        zeroCount[1] = 0;
        oneCount[1] = 1;
        for (int j = 2; j < 41; j++) {
            zeroCount[j] = zeroCount[j-1] + zeroCount[j-2];
            oneCount[j] = oneCount[j-1] + oneCount[j-2];
        }

        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(br.readLine());
            bw.write(zeroCount[a] + " " + oneCount[a] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
