package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (c % h == 0) {
                sb.append((h * 100) + (c / h)).append('\n');

            } else {
                sb.append(((c % h) * 100) + ((c / h) + 1)).append('\n');
            }
        }
        System.out.print(sb);

    }
}
