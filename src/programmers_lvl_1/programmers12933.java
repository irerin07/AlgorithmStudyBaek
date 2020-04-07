package programmers_lvl_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programmers12933 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;
        String[] s = String.valueOf(n).split("");
        String temp = "";

        Arrays.sort(s, Collections.reverseOrder());
        for(String s1: s){
            temp += s1;
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}
