import java.io.*;
import java.util.*;

public class IntegerTriangle {
    public static void main(String[] args) {
        
        /**
         * - Input
         * 5
         * 7
         * 3 8
         * 8 1 0
         * 2 7 4 4
         * 4 5 2 6 5
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] triangle = new int[n][n];
        while (sc.hasNextLine()) {
            if (!sc.hasNextInt()) {
                break;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = sc.nextInt();
                }
            }
        }
        sc.close();
        
        int[][] copyTriangle = new int[n][n];
        copyTriangle[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    copyTriangle[i][0] = copyTriangle[i-1][0] + triangle[i][0];
                } else if (j == i) {
                    copyTriangle[i][j] = copyTriangle[i-1][j-1] + triangle[i][j];
                } else {
                    copyTriangle[i][j] = Math.max(copyTriangle[i-1][j-1], copyTriangle[i-1][j]) + triangle[i][j];
                }
            }
        }

        int max = copyTriangle[n-1][0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, copyTriangle[n-1][i]);
        }

        System.out.println(max);
        /**
         * - Output
         * 30
         */
    }
}
