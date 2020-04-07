package programmers_lvl_1;

import java.util.Arrays;

public class programmers42840 {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int[] answer = solution(answers);
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

    }
    public static int[] solution(int[] answers){
        int[] answer = {};
        int[][] patt = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] counter = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == patt[0][i%5]){
                counter[0]+= 1;
            }
            if(answers[i] == patt[1][i%8]){
                counter[1]+=1;
            }
            if(answers[i]== patt[2][i%10]){
                counter[2]+=1;
            }
        }
        int max = counter[0];

        if(max < counter[1]) max = counter[1];
        if(max < counter[2]) max = counter[2];

        if(max == counter[0] && max == counter[1] && max == counter[2]) return new int[]{1,2,3};
        else if(max == counter[0] && max == counter[1]) return new int[]{1,2};
        else if(max == counter[0] && max == counter[2]) return new int[]{1,3};
        else if(max == counter[1] && max == counter[2]) return new int[]{2,3};
        else if(max == counter[0]) return new int[]{1};
        else if(max == counter[1]) return new int[]{2};

        return new int[]{3};

    }
}
