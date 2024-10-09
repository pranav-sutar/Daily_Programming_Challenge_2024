public class Q29 {

    // Function to calculate n-th Fibonacci number using dynamic programming
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Create an array to store Fibonacci numbers
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Fill the array with Fibonacci values
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n)); // Output: 5
    }
}
