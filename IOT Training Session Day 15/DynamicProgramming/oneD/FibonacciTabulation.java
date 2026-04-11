package DynamicProgramming.oneD;
// time complexity is O(n) and space complexity is also O(n)
public class FibonacciTabulation {
    // in the tabulation code, we create the dp array in the helper function
    public static int fib(int n){
        if(n<=1) {
            return n;
        }
        // step 1:Create a dp array of n+1 size(0-based indexing)
        // step 2:Store the known values
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        // take a for loop from 2 till n
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println("Fibonacci of 7 is:"+fib(n));
    }
}
