package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[10];
        int count = 1;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt()%42;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
