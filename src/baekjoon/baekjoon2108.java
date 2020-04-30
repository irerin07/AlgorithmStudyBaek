package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[8001];
        int sum = 0;
        int min = 4000;
        int max = -4000;
        int temp;
        for(int i = 0; i < N; i++){
            temp = Integer.parseInt(br.readLine());
            sum += temp;
            if(min > temp)
                min = temp;
            if(max < temp)
                max = temp;
            num[temp + 4000]++;
        }
        int avg = (int) Math.round((double) sum / N);

        int medianValue = 0;
        int accumulate = 0;
        boolean calcMedianValue = false;

        int mode = 0;
        ArrayList<Integer> modeList = new ArrayList<>();

        int half = (N & 1) == 1 ? N / 2 + 1 : N / 2;
        for(int i = 0; i <= 8000; i++){
            if(mode < num[i]) {
                mode = num[i];
                modeList.clear();
                modeList.add(i);
            } else if (mode == num[i]) {
                modeList.add(i);
            }
            accumulate += num[i];
            if(!calcMedianValue && accumulate >= half){
                medianValue = i - 4000;
                calcMedianValue = true;
            }
        }

        if(modeList.size() == 1){
            mode = modeList.get(0) - 4000;
        } else {
            mode = modeList.get(1) - 4000;
        }

        int range = max - min;

        System.out.println(avg);
        System.out.println(medianValue);
        System.out.println(mode);
        System.out.println(range);
        return;
    }
}