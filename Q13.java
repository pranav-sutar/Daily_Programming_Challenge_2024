public class Q13 {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;

        // Expand around center for each character and its pair
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);   // Even length palindrome
            int len = Math.max(len1, len2);

            // Update the start and end if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center and calculate the length of palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Length of the palindrome
    }

    public static void main(String[] args) {
        String s = "babad";

        String result = longestPalindrome(s);
        System.out.println("The longest palindromic substring is: " + result);
    }
}
