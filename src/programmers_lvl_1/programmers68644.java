package programmers_lvl_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class programmers68644 {
    public static void main(String[] args) {
        int[] a = {2,1,3,4,1};
        int[] solution = solution(a);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(int[] a){
        int[] ans = {};
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if (i==j){
                    continue;
                }
                int sum = a[i] + a[j];
                if(integers.indexOf(sum)<0){
                    integers.add(sum);
                }

            }
        }
        ans = new int[integers.size()];
        for(int i=0; i<integers.size(); i++) {
            ans[i]+=integers.get(i);
        }
        Arrays.sort(ans);
//        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
