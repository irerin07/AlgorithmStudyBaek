package baekjoon;

import java.io.*;

public class baekjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0;i<arr.length;i++) {
            if(s.contains(arr[i])) {
                s=s.replaceAll(arr[i],"i");
            }
        }
        bw.write(String.valueOf(s.length()));
        bw.flush();
        br.close();
        bw.close();
    }
}
