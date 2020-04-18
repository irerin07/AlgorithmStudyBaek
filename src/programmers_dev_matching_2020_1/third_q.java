package programmers_dev_matching_2020_1;

public class third_q {
    public static void main(String[] args) {
        int[] numbers = {};
        int k = 20;
        System.out.println(solution(numbers, k));
    }

    private static int solution(int[] numbers, int k) {
        int answer = 0;
        if(numbers.length == 0){
            answer = -1;
        }else if(numbers.length == 1){
            answer = 1;
        }else{
            for(int i = 0; i < numbers.length-1; i++){
                if(Math.abs(numbers[i+1] - numbers[i]) <= k){
                    answer += 0;
                }
            }
        }
        return answer;
    }
}
