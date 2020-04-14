package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon7576 {
    private static int M;
    private static int N;
    private static int[][] arr;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    private static int newX;
    private static int newY;
    private static Queue<Node> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 열
        M = Integer.parseInt(st.nextToken()); // 행
        arr = new int[M][N];
        q = new LinkedList<>();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(0,0);

    }

    private static void bfs(int x, int y) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    //익은 토마토가 있는 모든 위치를 큐에 담는다.
                    q.add(new Node(i, j));
                }

            }
        }
        while(!q.isEmpty()){
            Node n = q.poll();
            for(int i = 0; i < 4; i++){
                newX = n.x + dx[i];
                newY = n.y + dy[i];
                if(newX >= 0 && newY >= 0 && newX < M && newY < N){
                    if(arr[newX][newY] == 0){
                        arr[newX][newY] = arr[n.x][n.y]+1;
                        q.add(new Node(newX, newY));
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) {
                    //토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        //그렇지 않다면 최대값을 출력한다.
        System.out.println(max - 1);
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
