package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon11650 {
    //    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine().trim());
//        int[][] arr = new int[N][2];
//        String[] str = new String[2];
//        for (int i = 0; i < N; i++) {
//            str = br.readLine().split(" ");
//            arr[i][0] =Integer.parseInt(str[0]);
//            arr[i][1] = Integer.parseInt(str[1]);
//        }
//
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] x, int[] y) {
//                if (x[0] == y[0]) {
//                    return Integer.compare(x[1], y[1]);
//                }
//                return Integer.compare(x[0], y[0]);
//            }
//
//        });
//
//        for (int i = 0; i < N; i++) {
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }
//    }
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
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
                // TODO Auto-generated method stub
                if(o1[0] == o2[0]) {
                    return Integer.compare(o1[1],o2[1]);
                }
                else
                    return Integer.compare(o1[0], o2[0]);
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
