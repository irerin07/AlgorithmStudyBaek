package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon10773 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Stack<Integer> st = new Stack<>();
    for(int i = 0; i < n; i++){
      int temp = sc.nextInt();
      if(temp != 0){
        st.push(temp);
      }else if(temp == 0){
        st.pop();
      }
    }
    int ans = 0;
    for (Integer integer : st) {
      ans += integer;
    }

    System.out.println(ans);
  }
}
