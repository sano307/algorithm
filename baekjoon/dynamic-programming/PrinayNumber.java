import java.io.*;
import java.util.*;

public class PrinayNumber {
    public static void main(String[] args) {
    
        /**
         * - Input
         * 3
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Long[] count = new Long[91];
        count[0] = 0L;
        count[1] = 1L;
        count[2] = 1L;
        for (int i = 3; i <= n; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        
        System.out.println(count[n]);
        /**
         * - Output
         * 2
         */
    }
}
 