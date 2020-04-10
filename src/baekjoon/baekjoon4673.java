package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class baekjoon4673 {
    public static void main(String[] args) {
        boolean[] selfNumber = new boolean[10001];
        for(int n = 1; n <= 10000; n++){
            int dn = calculate(n);
            if(dn <=10000){
                selfNumber[dn] = true;
            }
        }
        for(int i = 1; i < selfNumber.length; i++){
            if(!selfNumber[i]){
                System.out.println(i);
            }
        }
    }
    private static int calculate(int a){
        int dn = a;
        while(a > 0) {
            dn += a % 10;
            a /= 10;
        }
        return dn;
    }
}
