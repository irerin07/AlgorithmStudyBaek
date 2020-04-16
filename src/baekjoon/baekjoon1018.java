package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1018 {
    public static int n, m, min = Integer.MAX_VALUE;
    public static char map[][];
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp, line[] = in.readLine().split(" ");
        n = Integer.parseInt(line[0]); m = Integer.parseInt(line[1]);
        int i, j, cnt; map = new char[n][m];
        for(i=0;i<n;i++){
            tmp = in.readLine();
            for(j=0;j<m;j++) map[i][j] = tmp.charAt(j);
        }
        for(i=0;i<=n-8;i++){
            for(j=0;j<=m-8;j++){

                cnt = Math.min(dfs(i, j, 8, 'W', 'B'), dfs(i, j, 8, 'B', 'W'));
                min = Math.min(cnt, min);
            }
        }
        out.write(min+"");
        out.close();
        in.close();
    }

    private static int dfs(int x, int y, int len, char left, char right){
        int half = len>>>1, count = 0;
        if(len==2){ //2*2가 될 때 까지 쪼갬
            if(map[x][y]!=left) count++;
            if(map[x][y+1]!=right) count++;
            if(map[x+1][y]!=right) count++;
            if(map[x+1][y+1]!=left) count++;
            return count;
        }

        count += dfs(x, y, half, left, right);
        count += dfs(x, y+half, half, left, right);
        count += dfs(x+half, y, half, left, right);
        count += dfs(x+half, y+half, half, left, right);

        return count;
    }
}