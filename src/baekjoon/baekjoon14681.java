package baekjoon;

import java.util.Scanner;

public class baekjoon14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(
                (a>0 && b>0)?1:
                        (a>0&&b<0)?4:
                                (a<0&&b<0)?3:
                                        (a<0&&b>0)?2:0
        );
    }
}
