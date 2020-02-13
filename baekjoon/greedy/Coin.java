import java.io.*;
import java.util.*;

public class Coin {
    public static void main(String[] args) {

        /**
         * - Input
         * 10 4200
         * 1
         * 5
         * 50
         * 100
         * 500
         * 1000
         * 5000
         * 10000
         * 50000
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (sc.hasNextInt()) {
            stack.push(sc.nextInt());
        }
        sc.close();

        int answer = 0;
        while (!stack.empty()) {
            int current = stack.pop();

            if (current > k) {
                continue;
            } else if (current == k) {
                answer++;
                break;
            } else {
                int count = (int)(k / current);
                answer += count;
                k -= current * count;
            }
        }

        System.out.println(answer);
        /**
         * - Output
         * 6
         */
    }
}
