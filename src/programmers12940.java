public class programmers12940 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int[] ans = (solution(n, m));
        for (int a : ans) {
            System.out.println(a);
        }
    }

    private static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = n;
        int b = m;

        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        answer[0] = a;
        answer[1] = (n*m)/a;
        return answer;
    }
}
