import java.util.HashSet;

public class Q15 {
    public static int lengthOfLongestSubstring(String s) {
        // Set to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        int maxLength = 0; // Result variable to store maximum length
        int left = 0; // Left pointer for sliding window
        
        // Iterate through the string with a right pointer
        for (int right = 0; right < s.length(); right++) {
            // If character already exists in set, slide the left pointer
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the character to the set and update the maximum length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String S = "abcabcbb";
        int result = lengthOfLongestSubstring(S);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
