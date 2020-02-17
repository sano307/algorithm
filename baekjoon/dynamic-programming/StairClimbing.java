import java.io.*;
import java.util.*;

public class StairClimbing {
    public static void main(String[] args) {

        /**
         * - Intput
         * 6
         * 10
         * 20
         * 15
         * 25
         * 10
         * 20
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stairs = new int[n+1];
        int index = 0;
        while (sc.hasNextInt()) {
            stairs[index] = sc.nextInt();
            index++;
        }
        sc.close();

        int[] dp = new int[n+1];
        dp[0] = stairs[0];
        dp[1] = Math.max(stairs[0] + stairs[1], stairs[1]);
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-2] + stairs[i], dp[i-3] + stairs[i-1] + stairs[i]);
        }

        System.out.println(Math.max(dp[n-2], dp[n-1]));
        /**
         * - Output
         * 75
         */
    }
}
