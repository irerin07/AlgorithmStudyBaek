package programmers_lvl_1;

public class programmers12943 {
    public static void main(String[] args) {
        int num = 626331;
        System.out.println(solution(num));
    }

    private static int solution(int num) {
        int answer = 0;
        for (int i = 0; i < 500; i++) {
            if (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
//                    System.out.println("num: " + num);
                    answer++;
                } else {
                    num = num * 3 + 1;
//                    System.out.println("num: " + num);
                    answer++;
                }
            }else{
                break;
            }
        }
//        System.out.println("num: " + num);
        if(num != 1){
            answer =  -1;
        }

        return answer;

    }

}
