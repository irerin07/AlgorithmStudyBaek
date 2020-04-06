import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers12935 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] sol = solution(arr);
        for (int i : sol) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr) {
//        if (arr.length <= 1) return new int[]{ -1 };
//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
        int[] answer = new int[arr.length - 1];;
        int min = arr[0];
        if (arr.length == 1) {
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            if (arr[j] == min) {
                j++;
                i--;
                continue;
            }
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }
}
