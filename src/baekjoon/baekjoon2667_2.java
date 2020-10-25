package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon2667_2 {

  private static int num;
  private static int count;
  private static int[][] vilage;
  private static int[][] visited;
  private static int[] xcoord = {-1, 1, 0, 0};
  private static int[] ycoord = {0, 0, -1, 1};
  private static List list;
  private static int newX;
  private static int newY;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    num = Integer.parseInt(br.readLine());
    vilage = new int[num][num];
    visited = new int[num][num];
    list = new ArrayList();

    for (int i = 0; i < num; i++) {
      String s = br.readLine();
      for (int j = 0; j < num; j++) {
        vilage[i][j] = Character.getNumericValue(s.charAt(j));
      }
    }

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (vilage[i][j] == 1 && visited[i][j] == 0) {
          count = 1;
          dfs(i, j);
          list.add(count);
        }
      }
    }
    Collections.sort(list);

    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  private static void dfs(int i, int j) {
    visited[i][j] = 1;
    for (int x = 0; x < 4; x++) {
      newX = i + xcoord[x];
      newY = j + ycoord[x];
      if (newX >= 0 && newY >= 0 && newX < num && newY < num) {
        if (vilage[newX][newY] == 1 && visited[newX][newY] == 0) {
          dfs(newX, newY);
          count++;
        }
      }
    }

  }

}
