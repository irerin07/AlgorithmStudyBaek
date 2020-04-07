package leetcode_week_1_chal;

public class leetcode3287 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int answer = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                answer += prices[i]-prices[i-1];
            }
        }
        return answer;
    }
}
