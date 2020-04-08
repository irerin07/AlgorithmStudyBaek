package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] kArr = new int[3];
        int[] ansArr = new int[3];
        int idx = 2;
        do {
            kArr[idx] = (k % 10);
            k /= 10;
            idx--;
        } while (k > 0);

        for (int i = 0; i < 3; i++) {
            ansArr[i] = n * kArr[2 - i];
        }
        for (int s : ansArr) {
            System.out.println(s);
        }
        System.out.println(ansArr[0] + (ansArr[1] * 10) + (ansArr[2] * 100));
    }
}
