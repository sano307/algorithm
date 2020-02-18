import java.io.*;
import java.util.*;

public class RgbDistance {
    public static void main(String[] args) {

        /**
         * - Input
         * 3
         * 26 40 83
         * 49 60 57
         * 13 89 99
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] costs = new int[n+1][3];
        int index = 0;
        while (sc.hasNextLine()) {
            if (!sc.hasNextInt()) {
                break;
            }

            for (int i = 0; i < 3; i++) {
                int cost = sc.nextInt();
                costs[index][i] = cost;
            }
            index++;
        }
        sc.close();

        int[][] calc = new int[n+1][3];
        calc[0][0] = costs[0][0];
        calc[0][1] = costs[0][1];
        calc[0][2] = costs[0][2];
        for (int i = 1; i <= n; i++) {
            calc[i][0] = Math.min(calc[i-1][1], calc[i-1][2]) + costs[i][0];
            calc[i][1] = Math.min(calc[i-1][0], calc[i-1][2]) + costs[i][1];
            calc[i][2] = Math.min(calc[i-1][0], calc[i-1][1]) + costs[i][2];
            System.out.println(String.format("%d %d %d", calc[i][0], calc[i][1], calc[i][2]));
        }

        System.out.println(Math.min(Math.min(calc[n][0], calc[n][1]), calc[n][2]));
        /**
         * - Output
         * 96
         */
    }
}
