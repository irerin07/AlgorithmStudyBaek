package toss;
import java.io.*;
import java.util.Stack;

public class toss1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] c = input.toCharArray();
        boolean res = true;

        for(int i = 0; i < c.length-1; i++){

            if(c[i] == '1' && c[i+1] != '2'){
                res = false;
                break;
            }
        }
        if(c[c.length-1] == '1'){
            res = false;
        }
        System.out.println(res);
    }
}
