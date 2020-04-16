package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class baekjoon10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int index = Integer.parseInt(br.readLine());
            arr[i] = index;
        }
        Arrays.sort(arr);
        for(int s: arr){
            System.out.println(s);
        }



//        for (int i = 1; i < 10001; i++) {
//            while (0 < arr[i]--) {
//
//                bw.write(i + "\n");
//            }
//        }
        br.close();
        bw.close();
    }
}