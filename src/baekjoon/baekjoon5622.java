package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] c = input.toCharArray();
        int answer = 0;
        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "OPERATOR"};
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j].contains(Character.toString(c[i]))){
                    answer = answer + j+3;
                    System.out.println("answer: " + answer);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
