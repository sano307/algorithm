import java.io.*;
import java.util.*;

public class WineTesting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] maximum = new int[n+1];
        int[] wines = new int[n+1];

        for (int i = 1; i <= n; i++) {
            wines[i] = sc.nextInt();
        }
        sc.close();

        if (n == 1) {
            System.out.println(wines[0]);
            return;
        }

        maximum[1] = wines[1];
        maximum[2] = maximum[1] + wines[2];
        for (int i = 3; i <= n; i++) {
            maximum[i] = Math.max(maximum[i-3] + wines[i-1] + wines[i], maximum[i-2] + wines[i]);
            maximum[i] = Math.max(maximum[i-1], maximum[i]);
        }

        System.out.println(maximum[n]);
    }
}
