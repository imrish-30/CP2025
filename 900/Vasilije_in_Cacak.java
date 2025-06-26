import java.util.*;


 public class Vasilije_in_Cacak
{
    public static void main(String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long minSum = k * (k + 1) / 2;
            long maxSum = (n * (n + 1)) / 2 - ((n-k) * (n-k+1)) / 2;
            //System.out.println(minSum+" "+maxSum);
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;

        }

    }
}