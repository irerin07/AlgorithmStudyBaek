package programmers_lvl_1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class programmers42889 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
//        int N = 4;
//        int[] stages = {4,4,4,4};
        int[] answer = solution(N, stages);
    }

    private static int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        int[] player_failed = new int[n+1];
        double[] stage_failure_rate = new double[n+1];
        int total_player = stages.length;
        for(int i = 0; i < stages.length; i++){
            if(stages[i] <= n) {
                player_failed[stages[i]] += 1;
            }else{
                continue;
            }
        }
        for(int s: player_failed){
            System.out.println(s);
        }
        for(int i = 1; i < stage_failure_rate.length; i++){
            System.out.println("player_failed[i]: " + player_failed[i]);
            if(player_failed[i] > 0) {
                stage_failure_rate[i] = (double) player_failed[i] / total_player;
                total_player -= player_failed[i];
            }else{
                stage_failure_rate[i] = 0;
            }
        }

        List stage_failure_rate_list = Arrays.stream(stage_failure_rate)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(stage_failure_rate_list);
        stage_failure_rate_list.remove(3);
        System.out.println(stage_failure_rate_list);

        Map map = new HashMap();
        for(int i = 1; i < stage_failure_rate.length; i++){
            map.put(i, stage_failure_rate[i]);
        }
        System.out.println(map);



        return answer;
//        int player = stages.length;
//        Arrays.sort(stages);
//        List<Integer> list = Arrays.stream(stages).boxed().collect(Collectors.toList());
//        Map<Integer, Double> map= new HashMap<>();
//        for(int s: stages){
//            map.put(s, (double) Collections.frequency(list,s));
//        }
//        System.out.println(map);
//        List<Integer> listWithoutDuplicates = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        for(int i = 0; i < listWithoutDuplicates.size(); i++){
//            int stage = listWithoutDuplicates.get(i);
//            double failedPlayer = map.get(stage);
//            map.replace(stage, map.get(stage)/player);
//            player = (int) (player - failedPlayer);
//
//        }
//        System.out.println(map);
    }
}
