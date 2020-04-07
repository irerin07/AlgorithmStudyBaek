package programmers_lvl_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class programmers42862 {
    public static void main(String[] args) {
        int n = 7;
        int[] lost = {2,3,4};
        int[] reserve = {1,2,3,6};
        System.out.println(solution(n, lost, reserve));

    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;

        HashSet<Integer> res = new HashSet<Integer>();

        for(int k : reserve) {
            res.add(k);
        }

        //체육복을 2벌 가지고 있지만 하나를 도둑맞은 경우
        for(int i = 0; i < lost.length; i++){
            if(res.contains(lost[i])){
                answer++; //참가 가능한 학생의 수를 늘려주고
                res.remove(lost[i]); //여분 체육복을 가진 학생의 리스트에서 내리고
                lost[i] = -1; //lost[i]를 -1로 변경하여 제외시킨다.
            }
        }

        //여분이 없고 체육복을 도둑맞아 빌려야 하는 경우
        for(int i = 0; i < lost.length; i++){
            if(res.contains(lost[i]-1)){
                answer++;
                res.remove(lost[i]-1);
            }else if(res.contains(lost[i] + 1)){
                answer++;
                res.remove(lost[i]+1);
            }
        }

        return answer;
    }
}
