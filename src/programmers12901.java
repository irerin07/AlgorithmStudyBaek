public class programmers12901 {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        System.out.println(solution(a,b));
    }
    public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int totaldays = 0;
        for(int i = 0; i < a-1; i++){
            totaldays+=(month[i]);
            System.out.println(totaldays);
        }
        totaldays += (b-1);
        answer = days[totaldays%7];

        return answer;
    }
}
