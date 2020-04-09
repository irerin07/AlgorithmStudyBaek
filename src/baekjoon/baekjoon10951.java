package baekjoon;

import java.io.*;

public class baekjoon10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while ((str = br.readLine()) != null) {
            String[] nums = str.split(" ", -1);
            bw.write(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + "\n");
        }

        bw.close();
        br.close();
    }
}



