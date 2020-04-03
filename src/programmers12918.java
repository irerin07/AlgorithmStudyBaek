public class programmers12918 {
    public static void main(String[] args) {
        String s = "12dw34";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        // boolean answer = false;
        //  if(s.length() == 4 || s.length()==6) {
        //      if (s.matches("^[A-Za-z]+$") || s.matches("^[0-9]+$")) {
        //          answer = true;
        //      }
        //  }
        //  return answer;
        return (s.matches("(^[0-9]{4}$|^[0-9]{6}$)"));

    }
}
