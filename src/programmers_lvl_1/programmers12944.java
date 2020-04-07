package programmers_lvl_1;

public class programmers12944 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }

    private static double solution(int[] arr) {
        double answer = 0;
        for(int s: arr){
            answer = answer + s;
        }
//        if(answer > 0){
//            answer = answer/arr.length;
//        }else{
//            answer = 0;
//        }
        return answer/arr.length;
    }
}
