import java.util.Scanner;

public class Q18 {

    public static int countDivisors(int N) {
        int count = 0;

        // Iterate through all potential divisors from 1 to N
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();

        int numDivisors = countDivisors(N);
        System.out.println("Number of divisors of " + N + " is: " + numDivisors);
    }
}