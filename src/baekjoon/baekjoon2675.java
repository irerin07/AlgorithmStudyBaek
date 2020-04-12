package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2675 {
    public static int repeat;
    public static char[] str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int T=0; T<test_case; T++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            repeat = Integer.parseInt(st.nextToken());
            str = st.nextToken().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length; i++) {
                for(int r = 0; r<repeat; r++)
                    sb.append(str[i]);
            }
            System.out.println(sb.toString());
        }
        br.close();

    }
}
