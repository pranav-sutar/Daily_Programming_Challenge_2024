import java.util.ArrayList;
import java.util.List;

public class Q17 {

    public static List<Integer> primeFactorization(int N) {
        List<Integer> primeFactors = new ArrayList<>();

        // Handle the case of N = 1
        if (N == 1) {
            return primeFactors;
        }

        // 2 is a special case
        while (N % 2 == 0) {
            primeFactors.add(2);
            N /= 2;
        }

        // Now check for odd divisors starting from 3
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                primeFactors.add(i);
                N /= i;
            }
        }

        // If N is still greater than 1, it's a prime factor itself
        if (N > 1) {
            primeFactors.add(N);
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        int N = 18;
        List<Integer> primeFactors = primeFactorization(N);
        System.out.println(primeFactors);
    }
}