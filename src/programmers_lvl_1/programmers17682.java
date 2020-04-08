package programmers_lvl_1;

import java.util.HashMap;
import java.util.Map;

public class programmers17682 {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        System.out.println(solution(dartResult));
    }

    private static int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        int curIdx = 0;
        String tempNum = "";
        for(char c : dartResult.toCharArray()) {
            if(Character.isDigit(c)) {
                tempNum = tempNum + c;
            }
            else {
                if(!"".equals(tempNum)) {
                    arr[curIdx++] = Integer.parseInt(tempNum);
                    tempNum = "";
                }
                switch (c) {
                    case 'S' :
                        arr[curIdx-1] = (int) Math.pow(arr[curIdx-1], 1);
                        break;
                    case 'D' :
                        arr[curIdx-1] = (int) Math.pow(arr[curIdx-1], 2);
                        break;
                    case 'T' :
                        arr[curIdx-1] = (int) Math.pow(arr[curIdx-1], 3);
                        break;
                    case '*' :
                        arr[curIdx-1] = arr[curIdx-1]*2;
                        if(curIdx-2 >= 0) {
                            arr[curIdx-2] = arr[curIdx-2]*2;
                        }
                        break;
                    case '#' :
                        arr[curIdx-1] = arr[curIdx-1]*-1;
                        break;
                }
            }
        }
        answer = arr[0]+arr[1]+arr[2];
        return answer;
    }
}
