package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int ans = 0;
        char[]c;
        for(int i = 0; i < n; i ++){
            c = br.readLine().toCharArray();
            for(int j = 0; j < c.length; j++){
                if(c[j] == 'O'){
                    count = count + 1;
                    ans = ans + count;
                }
                if(c[j] == 'X'){
                    count = 0;
                }
            }
            System.out.println(ans);
            count = 0;
            ans = 0;
        }
        br.close();

    }
}
