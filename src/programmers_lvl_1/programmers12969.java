package programmers_lvl_1;

import java.util.Scanner;

public class programmers12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
