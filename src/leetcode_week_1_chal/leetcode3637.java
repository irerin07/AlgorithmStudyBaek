package leetcode_week_1_chal;

public class leetcode3637 {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(solution(a));
    }
    public static int solution(int num){
        int ans = 0;

        while(num > 0){
            if(num%2 == 0){
                num /= 2;
            }else{
                num--;
            }
            ans++;
        }
        return ans;
    }
}
