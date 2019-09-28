import java.util.*;
import java.util.stream.Collectors;

public class programmersjobfair1 {
    public static void main(String[] args) {
        int[] goods = {5,3,7};
        int[] boxes = {3,7,6};
        System.out.println(solution(goods, boxes));
    }

    private static int solution(int[] goods, int[] boxes) {
        int answer = 0;

        List<Integer> goods1 = Arrays.stream(goods).boxed().collect(Collectors.toList());
        List<Integer> boxes1 = Arrays.stream(boxes).boxed().collect(Collectors.toList());

        Collections.sort(goods1);
        Collections.sort(boxes1);

        int inde = 0;
        for(int i : goods1) {
            if(boxes1.get(inde) >= i && inde <= boxes1.size()){
                answer++;
                inde++;
            }else if(boxes1.get(inde) < i && inde <= boxes1.size()){
                inde++;
            }else if(inde > boxes1.size()){
                break;
            }
        }

        return answer;
    }

}
