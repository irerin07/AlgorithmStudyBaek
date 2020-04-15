package programmers_lvl_2;

public class programmers60057 {
    public static void main(String[] args) {
        String s = "abcabcabcabcdededededede";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for(int len = 1 ; len < s.length() ; ++len){
            String compressed = "";
            String target = "";
            String current = "";
            int cnt = 1;

            // 첫 번쨰 단위 지정
            for(int i = 0 ; i < len ; ++i) {
                target += s.charAt(i);
            }

            System.out.println("target: " + target);
            // 단위만큼 잘랐을 때 각 부분의 시작 인덱스
            for(int i = len ; i < s.length() ; i += len){
                current = "";
                for(int j = i ; j < i + len ; ++j){
                    if(j >= s.length()) break;
                    current += s.charAt(j);
                }

                if(target.equals(current)){
                    cnt++;
                } else {
                    if(cnt > 1){
                        compressed += cnt + target;
                    } else {
                        compressed += target;
                    }
                    cnt = 1;
                    target = current;
                }
            }

            if(cnt > 1){
                compressed += cnt + target;
            } else {
                compressed += target;
            }

            int length = compressed.length();
            answer = answer > length ? length : answer;
        }

        if(answer == Integer.MAX_VALUE) answer = 1;

        return answer;
    }
}
