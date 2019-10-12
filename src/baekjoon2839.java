import java.util.Scanner;

public class baekjoon2839 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int threeKG = 0;
        int fiveKG = 0;

        while (sugar % 5 != 0 && sugar >= 0) {
            sugar -= 3;
            threeKG++;
        }
        if (sugar < 0) {
            System.out.println(-1);
        } else {
            fiveKG = sugar / 5;
            System.out.println(fiveKG + threeKG);
        }

    }
}
