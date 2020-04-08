package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon2798 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a <= M)
                list.add(a);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(solution(N, M, list));
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(int N, int M, ArrayList list){
        int answer = 0;
        int temp = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    temp = (int) list.get(i) + (int) list.get(j) + (int) list.get(k);
                    if(temp == M){
                        answer = temp;
                        return answer;
                    }else if(temp < M && temp > answer){
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
}
