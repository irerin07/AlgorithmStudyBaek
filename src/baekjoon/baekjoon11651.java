package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon11651 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int [][] sort = new int[n][2];
        for (int i = 0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                sort[i][0] = Integer.parseInt(st.nextToken());
                sort[i][1] = Integer.parseInt(st.nextToken());
            }

        }
        Arrays.sort(sort, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return Integer.compare(o1[0],o2[0]);
                }
                else
                    return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i<n; i++)
        {
            bw.write(sort[i][0] +" " + sort[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
