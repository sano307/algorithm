import java.io.*;
import java.util.*;

public class Rope {
    public static void main(String[] args) {

        /**
         * - Input
         * 2
         * 10
         * 15
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(n);
        while (sc.hasNextLine()) {
            if (!sc.hasNextInt()) {
                break;
            }

            queue.add(sc.nextInt());
        }
        sc.close();

        long max = 0L;
        while (queue.peek() != null) {
            int size = queue.size();
            long candidate = (long)(queue.poll() * size);
            max = Math.max(max, candidate);
        }

        System.out.println(max);
        /**
         * - Output
         * 20
         */
    }
}
