import java.util.Scanner;

public class baekjoon11047 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=n-1; i>=0; i--) {
            ans += k/a[i];
            k %= a[i];
        }
        System.out.println(ans);
    }
}
