package programmers_dev_matching_2020_1;

public class first_q {
    public static void main(String[] args) {
        String P = "00000000000000000000";
        String S = "91919191919191919191";
        System.out.println(solution(P, S));
        
    }

    private static int solution(String P, String S) {
        int answer = 0;
        for(int i = 0; i < P.length(); i++){
            if (P.charAt(i) == S.charAt(i)) {
                continue;
            }else{
                int i1 = Character.getNumericValue(P.charAt(i)) - Character.getNumericValue(S.charAt(i));
                if(Math.abs(i1) < 6){
                    answer = answer + Math.abs(i1);
                }else{
                    int abs = Math.abs(Character.getNumericValue(S.charAt(i)) - Character.getNumericValue(P.charAt(i)));
                    if(abs == 6){
                        answer = answer + abs - 2;
                    }else if(abs == 7){
                        answer = answer + abs - 4;
                    }else if(abs == 8){
                        answer = answer + abs - 6;
                    }else if(abs == 9){
                        answer = answer + abs - 8;
                    }
                }
            }
        }
        return answer;
        
    }
}
