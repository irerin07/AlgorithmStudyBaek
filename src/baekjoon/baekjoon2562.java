package baekjoon;

import java.util.Scanner;

public class baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = -100;
        int index = -1;
        for(int i = 0; i < arr.length; i ++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;

            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
