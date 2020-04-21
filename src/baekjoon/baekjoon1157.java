package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().toUpperCase();
        char ans = '?';
        int[] arr = new int[26];
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 65]++;
            if(max < arr[s.charAt(i) - 65]){
                max = arr[s.charAt(i) - 65];
                ans = s.charAt(i);
            }else if(max == arr[s.charAt(i) - 65]){
                ans = '?';
            }
        }

        bw.write(ans);
        bw.flush();
        br.close();
        bw.close();



    }
}
