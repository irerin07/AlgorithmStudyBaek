package baekjoon;

import java.io.*;

public class baekjoon4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str;
        String [] arr;
        int[] scoreArr;
        for(int i = 0; i < n; i++){
            arr = br.readLine().split(" ");
            int numStudent = Integer.parseInt(String.valueOf(arr[0]));
            scoreArr = new int[numStudent];
            int total = 0;
            double avg = 0;
            int aboveavg = 0;
            for(int j = 1; j < arr.length; j++){
                scoreArr[j-1] = Integer.parseInt(arr[j]);
            }
            for(int s: scoreArr){
                total = total+s;
            }
            avg = total/numStudent;
            for(int a: scoreArr){
                if(a > avg){
                    aboveavg = aboveavg + 1;
                }
            }
            String formatted = String.format("%.3f", (((double)aboveavg/numStudent)*100));
            bw.write(formatted+"%\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
