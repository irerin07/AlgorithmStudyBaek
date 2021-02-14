package leetcode_week_1_chal;

public class leetcode3638 {
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        grid[0][0] = 0;
        grid[1][1] = 0;
        grid[0][1] = 1;
        grid[1][0] = 1;

        System.out.println(solution(grid));
    }

    public static int solution(int[][] grid){
        int ans = 0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        


        return ans;
    }
}
