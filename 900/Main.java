import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();  // Fixed from long to int
            long[] arr = new long[n];
            long ans = b;  // Fixed from int to long

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                ans = ans + Math.min(a - 1, arr[i]);  // Now all are long
            }

            System.out.println(ans);
            t = t - 1;
        }
    }
}
