package programmers_lvl_1;

import java.util.Arrays;

public class programmers12982 {
    public static void main(String[] args) {
        int[] d = {5,6,7,8,9};
        int budget = 2;
        System.out.println(solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for(int i = 0; i < d.length; i++){
            sum += d[i];
            if(sum < budget){
                answer++;
            }else if(sum == budget){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}
