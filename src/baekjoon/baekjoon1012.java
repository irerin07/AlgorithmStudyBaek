package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon1012 {
    private static int T, M, N, K, earthworm;
    private static int[][] land;
    private static int[][] visited;
    private static int dx[] = {-1,1,0,0};
    private static int dy[] = {0,0,-1,1};
    private static int newX;
    private static int newY;
    private static List list;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken()); // 행
        N = Integer.parseInt(st.nextToken()); // 열
        K = Integer.parseInt(st.nextToken()); // 배추의 개수
        list = new ArrayList();

        land = new int[M][N];
        visited = new int[M][N];
        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            land[x][y] = 1;
        }
        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j++){
                if(land[i][j] == 1 && visited[i][j] == 0){
                    earthworm = 0;
                    dfs(i,j);
                    list.add(earthworm);
                }
            }
        }
        System.out.println(list.size());

    }

    private static void dfs(int x, int y) {
        visited[x][y] = 1;

        for(int i = 0; i < 4; i++){
            newX = x + dx[i];
            newY = y + dy[i];

            if(newX>=0&&newY>=0&&newX<M&&newY<N) {
                if(land[newX][newY] == 1 && visited[newX][newY] == 0){
                    dfs(newX, newY);
                    earthworm++;
                }

            }
        }
    }
}
