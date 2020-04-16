package baekjoon;

import java.util.*;
import java.io.*;

public class baekjoon2751 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
            List <Integer> arr =new ArrayList<>();
            for(int i=0;i<n;i++) {
                arr.add(Integer.parseInt(br.readLine())); //정수입력
            }
            Collections.sort(arr);
            for(int i=0;i<n;i++) {
                bw.write(arr.get(i)+"\n");
            }
            bw.flush();
            bw.close();

    }
}
