import java.io.*;
import java.util.*;

public class Coin {
    public static void main(String[] args) {

        int n = 10;
        int k = 4200;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(50);
        stack.push(100);
        stack.push(500);
        stack.push(1000);
        stack.push(5000);
        stack.push(10000);
        stack.push(50000);

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
    }
}
