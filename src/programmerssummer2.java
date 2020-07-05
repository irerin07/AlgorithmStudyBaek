import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class programmerssummer2 {
    public static void main(String[] args) {
        long n = 3;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;
        List<Long> prev = new ArrayList<>();


        if(n == 1)return 1L;
        if(n == 2)return 3L;

        for(int i = 0; i < n-1; i++){
            long temp = (long)Math.pow(3, i);
            if(prev.size() >= 2){
                recursion(temp);
            }
        }

        return answer;
    }

    private static long recursion(long temp){
        long ans = 0L;
        return ans;
    }
}
