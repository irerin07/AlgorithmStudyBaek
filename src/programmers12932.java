public class programmers12932 {
    public static void main(String[] args) {
        long n = 2147483647;
        int[] n1 = solution(n);
    }

    private static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0;
        while (n > 0) {
            n = n % 10;
            n /= 10;
            answer[index++] = (int) n;
        }
        return answer;
    }
}
