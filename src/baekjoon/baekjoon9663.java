  package baekjoon;

  import java.io.BufferedReader;
  import java.io.InputStreamReader;

  public class baekjoon9663 {

    public static int n;
    public static int count;

    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());

      for (int i = 0; i <= n; i++) {
        int[] col = new int[n + 1];
        col[1] = i;
        dfs(col, 1);
      }
      System.out.println(count);
    }

    public static void dfs(int[] col, int row) {
      if (row == n) {
        count++;
      } else {
        for (int i = 1; i <= n; i++) {
          col[row + 1] = i;
          if (isPossible(col, row + 1)) {
            dfs(col, row + 1);
          }
        }
      }

    }

    public static boolean isPossible(int[] col, int row) {

      for (int i = 1; i < row; i++) {
        if (col[i] == col[row]) {
          return false;
        }

        if (Math.abs(i - row) == Math.abs(col[i] - col[row])) {
          return false;
        }
      }
      return true;
    }
  }
