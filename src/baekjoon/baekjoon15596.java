package baekjoon;

public class baekjoon15596 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(arr));

    }


    private static long sum(int[] a){
        long answer = 0;
        for(int i: a){
            answer = answer + (long)i;
        }
        return answer;
    }
}
