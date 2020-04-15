package programmers_lvl_2;

import java.util.LinkedList;
import java.util.Queue;

public class programmers42583 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waiting = new LinkedList<>();
        Queue<Truck> crossing = new LinkedList<>();

        for(int i = 0 ; i < truck_weights.length ; ++i){
            waiting.offer(new Truck(truck_weights[i], 0));
        }

        int answer = 0;
        int totalWeight = 0;
        while(!waiting.isEmpty() || !crossing.isEmpty()){
            answer++;
            if(!crossing.isEmpty()) {
                Truck t = crossing.peek();
                if(answer - t.position >= bridge_length) {
                    totalWeight -= t.weight;
                    crossing.poll();
                }
            }

            if(!waiting.isEmpty()) {
                if(totalWeight + waiting.peek().weight <= weight) {
                    Truck t = waiting.poll();
                    totalWeight += t.weight;

                    crossing.offer(new Truck(t.weight, answer));
                }
            }
        }
        return answer;
    }

    static class Truck {
        int weight;
        int position;

        Truck(int weight, int position){
            this.weight = weight;
            this.position = position;
        }
    }
}
