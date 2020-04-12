package baekjoon;

import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c =  str.toCharArray();
        int total = 0;
        if(n == 1){
            System.out.println(str);
        }else {
            for (int i = 0; i < n; i++) {
                total = total + Character.getNumericValue(c[i]);
            }
            System.out.println(total);
        }
    }
}
