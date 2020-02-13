import java.io.*;
import java.util.*;

public class PlusOneTwoThree {
    public static void main(String[] args) {
        
        /**
         * - Input
         * 3
         * 4
         * 7
         * 10
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        sc.close();

        int[] dp = new int[10001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dp[list.get(i)]);
        }

        /**
         * - Output
         * 7
         * 44
         * 274
         */
    }
}
