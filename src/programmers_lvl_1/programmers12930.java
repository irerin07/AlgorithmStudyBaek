package programmers_lvl_1;

import java.util.Arrays;
import java.util.List;

public class programmers12930 {
    public static void main(String[] args) {
        String s = "try     hello        world";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        int index = 0; // 현재 단어의 몇번째를 가리키고 있는지 알려주는 역할을 하는 변수

        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals(" ")) {
                index = 0;
                answer += " ";
                // 단어끼리는 서로 공백으로 구분이 되므로 공백을 만난 경우 index를 0으로 바꿔주고 " "을 답에 붙인다.
            } else {
                if (index % 2 == 0) {
                    answer += Character.toString(s.charAt(i)).toUpperCase();// index번째 알파벳이 짝수면 대문자로
                } else {
                    answer += Character.toString(s.charAt(i)).toLowerCase();// index번째 알파벳이 홀수면 대문자로
                }
                index++;
            }
        }

        return answer;
    }
}
