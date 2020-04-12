package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int max = 0;
        for(int i = 0; i < s.length; i++){
            String reverse = "";
            for(int j = s[i].length()-1; j >= 0; j--){
                reverse = reverse + s[i].charAt(j);
            }
            if((max < Integer.parseInt(reverse))){
                max = Integer.parseInt(reverse);
            }

        }
        System.out.println(max);
    }
}