package baekjoon;

import java.util.Scanner;

public class baekjoon2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a % 400 == 0)? 1:(a % 4 == 0 && a % 100 != 0)? 1:0);
    }
}