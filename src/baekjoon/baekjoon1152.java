package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String[] input = s.split(" ");

        if (s.isEmpty()) {
            System.out.println(0);
        } else {

            System.out.println(input.length);
        }
    }
}
