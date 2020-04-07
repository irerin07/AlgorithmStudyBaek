package programmers_lvl_1;

public class programmers12954 {
    public static void main(String[] args) {
        int x = 10000000;
        int n = 1000;
        long[] answer = solution(x, n);
        for(long l: answer){
            System.out.println(l);
        }
    }

    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++){
            answer[i-1] =(long) x * i;
        }
        return answer;
    }
}
