import java.io.*;
import java.util.*;

public class MakeItOne {
    public static void main(String[] args) {
        
        /**
         * - Input
         * 10
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(solve(n));
        /**
         * - Output
         * 3
         */
    }

    public static int solve(int n) {
        int[] temp = new int[n+1];
        temp[0] = 0;
        temp[1] = 0;

        for (int i = 2; i <= n; i++) {
            temp[i] = temp[i-1] + 1;
            
            if (i % 2 == 0) {
                temp[i] = Math.min(temp[i], temp[i/2]+1);
            }
            if (i % 3 == 0) {
                temp[i] = Math.min(temp[i], temp[i/3]+1);
            }
        }

        return temp[n];
    }
}
