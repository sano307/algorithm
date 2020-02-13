import java.io.*;
import java.util.*;

public class Atm {
    public static void main(String[] args) {

        /**
         * - Input
         * 5
         * 3 1 4 3 2
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine().trim();

        int[] times = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(times);

        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                answers[0] = times[0];
                continue;
            }

            answers[i] = answers[i-1] + times[i];
        }

        int answer = Arrays.stream(answers).sum();
        System.out.println(answer);
        /**
         * - Output
         * 32
         */
    }
}
