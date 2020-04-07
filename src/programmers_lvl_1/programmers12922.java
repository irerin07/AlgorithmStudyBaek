package programmers_lvl_1;

public class programmers12922 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        String answer = "";

        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                answer += "수";
            }else{
                answer+="박";
            }
        }
        return answer;
    }
}
