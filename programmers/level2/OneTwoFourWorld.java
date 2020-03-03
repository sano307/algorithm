import java.io.*;
import java.util.*;

class OneTwoFourWorld {
    public static void main(String[] args) {

        /**
         * - Input
         * 500000000
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuffer sb = new StringBuffer();
        while (n != 0) {
            if (n % 3 == 0) {
                sb.append(4);
                n = n / 3 - 1;
            } else {
                sb.append(n % 3);
                n = n / 3;
            }
        }

        System.out.println(sb.reverse().toString());
        /**
         * - Output
         * 421211211121241112
         */
    }
}
