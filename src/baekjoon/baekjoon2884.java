package baekjoon;

import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            System.out.println(H + " " + (M-45));
        }else{
            if(H-1 < 0){
                H = 24;
            }
            M = 60 + M - 45;
            System.out.println(H-1 + " " + M);
        }
    }
}
