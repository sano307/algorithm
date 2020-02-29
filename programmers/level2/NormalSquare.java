import java.io.*;
import java.util.*;
import java.math.*;

class NormalSquare {
    public static void main(String[] args) {

        /**
         * - Input
         * 8
         * 12
         */
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w <= 1 || h <= 1) {
            System.out.println(0);
        }
        
        BigDecimal a = BigDecimal.valueOf(h).divide(BigDecimal.valueOf(w), MathContext.DECIMAL128);
        long cnt = 0;
        for (int x = 1; x < w; x++) {
            BigDecimal y = BigDecimal.valueOf(x).multiply(a, MathContext.DECIMAL64);
            cnt += y.longValue();
        }
        
        System.out.println(cnt * 2);
        /**
         * - Output
         * 80
         */
	}
}
