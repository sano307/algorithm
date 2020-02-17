import java.io.*;
import java.util.*;

public class Tiling {
    public static void main(String[] args) {

        /**
         * - Input
         * 9
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 3) {
            System.out.println(n);
            return;
        }

        int[] methods = new int[n+1];
        methods[0] = 0;
        methods[1] = 1;
        methods[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            methods[i] = (methods[i-1] + methods[i-2]) % 10007;
        }

        System.out.println(methods[n]);
        /**
         * - Output
         * 55
         */
    }
}
