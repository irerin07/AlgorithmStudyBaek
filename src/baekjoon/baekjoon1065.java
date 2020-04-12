package baekjoon;

import java.util.Scanner;

public class baekjoon1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 100){
            //1부터 99까지는 모두 한수이다.
            System.out.println(n);
        }else{
            int answer = 99;
            for(int i = 100; i <= n; i++){
                answer = answer + calculate(i);
            }
            if(n == 1000){
                answer--;
            }
            System.out.println(answer);
        }
        sc.close();

    }
    private static int calculate(int a){
        int answer = 0;
        int x = a / 100 % 10;
        int y = a / 10 % 10;
        int z = a % 10;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        if(y * 2 == x+z){
            answer = 1;
        }

        return answer;
    }
}
