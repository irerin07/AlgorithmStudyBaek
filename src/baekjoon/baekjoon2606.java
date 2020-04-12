package baekjoon;

import java.util.Scanner;

public class baekjoon2606 {
    static int count;
    static int[][] graph;
    static int[] visited;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        visited = new int[n+1];

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }

    private static void dfs(int start) {
        visited[start] = 1;
        for(int i = 1; i < n+1; i ++){
            if(graph[start][i] == 1 && visited[i] == 0){
                dfs(i);
                count++;
            }
        }
    }
}
