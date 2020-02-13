import java.io.*;
import java.util.*;

public class Fibonacci {
    public static int[] calls = new int[41];
    public static void main(String[] args) {

        /**
         * - Input
         * 3
         * 0
         * 1
         * 3
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        while (sc.hasNextInt()) {
            queue.add(sc.nextInt());
        }

        calls[0] = 1;
        calls[1] = 1;
        for (int i = 0; i < n; i++) {
            int target = queue.poll();

            if (target == 0) System.out.println("1 0");
            else if (target == 1) System.out.println("0 1");
            else {
                fibonacci(target);
                System.out.println(String.format("%d %d", calls[target-2], calls[target-1]));
                /**
                 * - Output
                 * 1 0
                 * 0 1
                 * 1 2
                 */
            }
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return calls[n];
        } else {
            if (calls[n] > 0) {
                return calls[n];
            }
        }

        return calls[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}
