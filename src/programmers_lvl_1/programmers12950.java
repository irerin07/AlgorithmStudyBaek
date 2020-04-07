package programmers_lvl_1;

public class programmers12950 {
    public static void main(String[] args) {
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        int[][] answer = solution(arr1, arr2);
        for(int[] s: answer){
            for(int a: s){
                System.out.println(a);
            }
        }
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length;i++){
            for(int j = 0; j < answer[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
