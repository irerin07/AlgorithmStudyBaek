public class leetcode3285 {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        System.out.println("max1: " + max);
        for (int i = 0; i < nums.length; i++) {

            max = Math.max(sum += nums[i], max);
            System.out.println("max: " + max);
            sum = Math.max(sum, 0);
            System.out.println("sum: " + sum);
        }
        return max;
    }
}
