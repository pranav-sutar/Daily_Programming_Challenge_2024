import java.util.Scanner;

public class Q16 {

    // Method to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Method to calculate the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter second number (M): ");
        int M = scanner.nextInt();

        // Calculate and output the LCM
        int result = lcm(N, M);
        System.out.println("LCM of " + N + " and " + M + " is: " + result);

        scanner.close();
    }
}
