import java.io.*;
import java.util.*;

public class Change {
    public static void main(String[] args) {

        /**
         * - Input
         * 380
         */
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        sc.close();

        int change = 1000 - payment;
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        int count = 0;
        for (int c : coins) {
            int portion = change / c;
            if (portion < 1) {
                continue;
            }

            change = change % c;
            count += portion;

            if (change == 0) {
                break;
            }            
        }

        System.out.println(count);
        /**
         * - Output
         * 4
         */
    }
}
