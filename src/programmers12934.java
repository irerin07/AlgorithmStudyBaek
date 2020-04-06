public class programmers12934 {
    public static void main(String[] args) {
        long n = 1;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;
        for(int i = 0; i <= n; i++){
            if(i*i == n){
                answer = (i + 1)*(i+1);
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
