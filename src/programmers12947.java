public class programmers12947 {
    public static void main(String[] args) {
        int x = 13;
        System.out.println(solution(x));
    }

    private static boolean solution(int x) {
        boolean answer = true;
        int temp = 0;
        int temp2 = x;
        while(temp2 > 0){
            temp += temp2%10;
            temp2 /= 10;
        }
        if(x % temp != 0){
            answer = false;
        }

        return answer;
    }
}
