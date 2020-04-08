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

    private static int[] solution(int N, int[] stages) {
        int remain[] = new int[N+1];
        int pass[] = new int[N];
        for(int i=0; i<stages.length;i++) {
            remain[stages[i]-1]++;
            for(int j =0; j<stages[i]-1; j++) {
                pass[j]++;
            }
        }
        double[] fail = new double[N];
        for(int i= 0; i<N; i++) {
            if(pass[i]==0&&remain[i]==0) {
                fail[i]=0;
            }
            else
                fail[i] = (double)remain[i]/(double)pass[i];
        }

        HashMap<Integer, Double> failmap = new HashMap<Integer, Double>();
        for(int i=0; i<N;i++) {
            failmap.put(i+1, fail[i]);
        }
        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            double max = -1;
            int maxkey = 0;
            for ( Integer key : failmap.keySet()) {
                if(max <failmap.get(key)) {
                    max = failmap.get(key);
                    maxkey = key;
                }
            }
            answer[i]=maxkey;
            failmap.remove(maxkey);
        }





        return answer;
//        int[] answer = new int[n];
//        int[] player_failed = new int[n+1];
//        double[] stage_failure_rate = new double[n+1];
//        int total_player = stages.length;
//        for(int i = 0; i < stages.length; i++){
//            if(stages[i] <= n) {
//                player_failed[stages[i]] += 1;
//            }else{
//                continue;
//            }
//        }
//        for(int s: player_failed){
//            System.out.println(s);
//        }
//        for(int i = 1; i < stage_failure_rate.length; i++){
//            System.out.println("player_failed[i]: " + player_failed[i]);
//            if(player_failed[i] > 0) {
//                stage_failure_rate[i] = (double) player_failed[i] / total_player;
//                total_player -= player_failed[i];
//            }else{
//                stage_failure_rate[i] = 0;
//            }
//        }
//
//        List stage_failure_rate_list = Arrays.stream(stage_failure_rate)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(stage_failure_rate_list);
//        stage_failure_rate_list.remove(3);
//        System.out.println(stage_failure_rate_list);
//
//        Map map = new HashMap();
//        for(int i = 1; i < stage_failure_rate.length; i++){
//            map.put(i, stage_failure_rate[i]);
//        }
//        System.out.println(map);
//
//
//
//        return answer;
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
