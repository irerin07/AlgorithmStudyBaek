public class programmers12926 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));
    }

    private static String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = (char)((ch+ n%26 - 'a') % 26 + 'a');
            } else if(Character.isUpperCase(ch)) {
                ch = (char)((ch + n%26 - 'A')% 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }
}
