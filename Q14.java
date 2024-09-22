import java.util.HashMap;

public class Q14 {

    // Function to count substrings with exactly K distinct characters
    public static int countKDistinctSubstrings(String s, int k) {
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }

    // Helper function to count substrings with at most K distinct characters
    private static int countAtMostKDistinct(String s, int k) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        int left = 0, right = 0, count = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);
            right++;

            // Shrink the window if there are more than k distinct characters
            while (charFrequency.size() > k) {
                char leftChar = s.charAt(left);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                left++;
            }

            // Count the number of substrings with at most k distinct characters
            count += right - left;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;

        int result = countKDistinctSubstrings(s, k);
        System.out.println("The number of substrings with exactly " + k + " distinct characters is: " + result);
    }
}
