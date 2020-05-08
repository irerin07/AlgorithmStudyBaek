package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String [][] sort = new String[n][2];
        for (int i = 0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                sort[i][0] = (st.nextToken());
                sort[i][1] = (st.nextToken());
            }
        }

        Arrays.sort(sort,new Comparator<String[]>() { // 0:나이 , 1:이름

            @Override
            public int compare(String[] o1,String[] o2) {

                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));

            }

        });

        for(int i=0;i<sort.length;i++) {

            bw.write(sort[i][0]+" "+sort[i][1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
