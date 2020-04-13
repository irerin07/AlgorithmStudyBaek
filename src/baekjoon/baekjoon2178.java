package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2178 {
    private static int M;
    private static int N;
    private static int[][] arr;
    private static int[][] visited;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    private static int newX;
    private static int newY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken()); // 행
        N = Integer.parseInt(st.nextToken()); // 열
        arr = new int[M][N];
        visited = new int[M][N];

        for(int i = 0; i < M; i++){
            String s = br.readLine();
//            System.out.println(s);
            for(int j = 0; j < N; j++){
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        bfs(0,0);
        System.out.println(arr[M-1][N-1]);

    }

    private static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        //큐에 Node가 없을때까지
        while(!queue.isEmpty()){
            Node n = queue.poll();
            for(int i = 0; i < 4; i++){
                //상하좌우를 돌며 다음 좌표 newX, newY를 찾는다.
                newX = n.x + dx[i];
                newY = n.y + dy[i];

                //범위를 초과하지 않는 좌표이고
                if (newX >= 0 && newY >= 0 && newX < M && newY < N) {
                    //아직 방문하지 않은 좌표인 경우
                    if (arr[newX][newY] == 1 && visited[newX][newY] == 0) {
                        //다음에 방문할 노드를 큐에 추가
                        queue.add(new Node(newX, newY));
                        //방문했음으로 표시
                        visited[newX][newY] = 1;
                        //1칸 움직이므로 다음 노드의 거리 + 1
                        arr[newX][newY] = arr[n.x][n.y] + 1;
                    }

                }
            }
        }

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
