import java.util.Arrays;

public class Q30 {

    public static int coinChange(int[] coins, int amount) {
        // Create a dp array to store the minimum number of coins for each amount
        int[] dp = new int[amount + 1];
        
        // Initialize dp array with a large value (amount + 1)
        Arrays.fill(dp, amount + 1);
        
        // Base case: to make amount 0, no coins are needed
        dp[0] = 0;

        // Iterate over each amount from 1 to 'amount'
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If the value in dp[amount] is still greater than amount, return -1 (not possible)
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount)); // Output: 3
    }
}
