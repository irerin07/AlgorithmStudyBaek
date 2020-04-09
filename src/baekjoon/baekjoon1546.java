package baekjoon;

import java.util.Scanner;

public class baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = 0;
        double avg = 0;
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextDouble();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = (arr[i]/max) * 100;
        }
        for(double s: arr){
            avg += s;
        }
        String formatted = String.format("%.6f", (avg/n));
        System.out.println(formatted);

    }
}
