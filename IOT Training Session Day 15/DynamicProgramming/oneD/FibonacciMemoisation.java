package DynamicProgramming.oneD;

import java.util.Arrays;

public class FibonacciMemoisation {
    public static int fib(int n,int[] dp){
        // base case
        if(n<=1)
            return n;
            //Step 2:if u have the value don calculate just return
        if (dp[n] != -1)
                return dp[n];
            //step 3: if we don't know the answer then calculate the answer
            return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        }
    public static void main(String[] args) {
        int n=6;
        // Step 1: Create a 1D dp table of size n+1(0-based)
        int[]dp=new int[n+1]; // 0-based
        // sub step of 1: Fill the array with default values -1
        Arrays.fill(dp,-1);
        System.out.println("Fibonacci of 6 is:"+fib(n,dp));
    }
}
