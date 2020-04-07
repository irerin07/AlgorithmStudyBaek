package programmers_lvl_1;

import java.util.Arrays;

public class programmers42576 {
    public static void main(String[] args) {
        String[] praticipant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(praticipant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])){
                return participant[i];
            }else{
                answer = participant[completion.length];
            }
        }
        return answer;
    }

}
