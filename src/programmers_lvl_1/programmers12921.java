package programmers_lvl_1;

public class programmers12921 {
    public static void main(String[] args) {
        int n = 1000000;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n + 1];

        //2부터 시작해서 i의 배수들을 1로 만든다
        for (int i = 2; i <= n; i++) {
            //numbers[i]의 저장된 수가 만약 1이면 지나가고
            if (numbers[i] == 1) continue;
            //아니라면 1로 만들어준다.
            for (int j = i * 2; j <= n; j += i) {
                numbers[j] = 1;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (numbers[i] == 0) answer++;
        }

        return answer;
    }
}
