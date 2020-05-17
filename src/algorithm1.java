public class algorithm1 {
    public static void main(String[] args) {
        int num = 99;

        int sum = 0;
        int res = 0;

        int cnt = 1;

        int digit = 9;

        while(sum + digit < num){
            sum = sum + digit;
            System.out.println("sum: " + sum);
            res = res + (cnt*digit);
            System.out.println("res: " + res);
            cnt++;
            System.out.println("cnt: " + cnt);
            digit = digit * 10;
            System.out.println("digit: " + digit);
        }
        System.out.println(res + ((num-sum) * cnt));


    }
}
