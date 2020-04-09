package baekjoon;

import java.util.Scanner;

public class baekjoon2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] arr = new int [10];
        int total = 1;
        for(int i = 0; i < n; i++){
            total = total * sc.nextInt();
        }
        char[] stringToCharArray = String.valueOf(total).toCharArray();
        for(char c:stringToCharArray){
            arr[Character.getNumericValue(c)] = arr[Character.getNumericValue(c)] + 1;
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
