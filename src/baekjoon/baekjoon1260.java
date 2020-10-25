package baekjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class baekjoon1260 {

  static int vertex;
  static int edge;
  static int start;
  public static int a, b;
  public static int[][] graph;
  public static boolean visit[];

  public static void dfs(int i) {
    visit[i] = true;
    System.out.print(i+" ");
    for(int j = 1; j <= vertex; j++) {
      if(graph[i][j] == 1 && visit[j] == false) {
        dfs(j);
      }
    }

  }

  public static void bfs(int i) {
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(i);
    visit[i] = true;

    while(!q.isEmpty()) {
      i = q.poll();
      System.out.print(i + " ");

      for(int j = 1; j<=vertex; j++) {
        if(graph[i][j] == 1 && visit[j] == false) {
          q.offer(j);
          visit[j] = true;
        }
      }

    }



  }

  public static void resetVisit(boolean[] visit) {
    for(int j=1; j<=vertex; j++){
      visit[j]=false;
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    vertex = sc.nextInt();
    graph = new int[vertex+1][vertex+1];
    edge = sc.nextInt();
    visit = new boolean[vertex+1];
    start = sc.nextInt();


    for(int i = 1; i <= edge; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      graph[a][b] = graph[b][a] = 1;
    }

    dfs(start);
    resetVisit(visit);
    System.out.println();
    bfs(start);
  }
}