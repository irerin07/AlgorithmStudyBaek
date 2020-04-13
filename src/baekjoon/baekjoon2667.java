package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon2667 {
    private static int[][] visited;
    private static int[][] vilage;
    private static List list;
    private static int count;
    private static int n;
    private static int dx[] = {-1,1,0,0};
    private static int dy[] = {0,0,-1,1};
    private static int newX;
    private static int newY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        vilage = new int[n][n];
        visited = new int[n][n];
        list = new ArrayList();
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<n; j++) {
                vilage[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                if(vilage[i][j] == 1 && visited[i][j] == 0){
                    count = 1;
                    dfs(i,j);
                    list.add(count);

                }
            }
        }
        Collections.sort(list);


        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }

    private static void dfs(int i, int j) {
        visited[i][j] = 1;

        for(int x=0;x<4;x++){
            newX = i + dx[x];
            newY = j + dy[x];
            if(newX>=0&&newY>=0&&newX<n&&newY<n) {
                if(vilage[newX][newY] == 1 && visited[newX][newY] == 0)
                {
                    dfs(newX,newY);
                    count++;
                }
            }
        }

    }
}
