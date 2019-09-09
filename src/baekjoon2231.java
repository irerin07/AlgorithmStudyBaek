import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));

    }
    public static int solution(int N){
        int answer = 0;

        for(int i = 0; i < N; i++){
            int temp = i;
            for(int j = 0; j < String.valueOf(i).length(); j++){
                temp = temp + String.valueOf(i).charAt(j)-48;
            }
            if(temp == N){
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
