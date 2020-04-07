package programmers_lvl_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    private static String solution(String[] seoul) {
        String answer = "";
        List<String> list = Arrays.asList(seoul);
        answer = "김서방은 " +list.indexOf("Kim")+ "에 있다";
        return answer;
    }
}
