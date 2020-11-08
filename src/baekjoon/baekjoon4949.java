package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class baekjoon4949 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Stack st = new Stack<>();

    String s1 = br.readLine();

    while (!s1.equals(".")) {
      st.clear();
      for (int i = 0; i < s1.length(); i++) {
        char c = s1.charAt(i);
        if (c == '(' || c == '[') {
          st.push(c);
        } else if (c == ')' || c == '['){
          switch (c){
            case ')':
              char peek = (char) st.peek();
                            
          }
        }
      }
      s1 = br.readLine();
    }
  }
}
