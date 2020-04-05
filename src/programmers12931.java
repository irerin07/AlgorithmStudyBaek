public class programmers12931 {
    public static void main(String[] args) {
        int n = 120;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        while (n > 0){
            answer +=  n%10;
            n = n/10;
        }
//        String s = String.valueOf(n);
//        for(int i = 0; i < s.length(); i++){
//            int a = Character.getNumericValue(s.charAt(i));
//            answer += a;
//        }

        return answer;
    }
}
