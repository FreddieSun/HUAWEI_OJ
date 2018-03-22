import java.util.*;

public class Lingqiancouzheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = helper(N);
        System.out.println(res);
    }

    public static long helper(int n ) {
        if ( n <= 0) return 0;
        int[] list = new int[]{1,5,10,20,50,100};
        long[] dp = new long[n+1];
        dp[0] = 1;
        for (int i = 0; i < list.length; i++) {
            for (int j = list[i]; j <= n; j++) {
                dp[j] += dp[j - list[i]];
            }
        }
        return dp[n];
    }
}