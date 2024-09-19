public class Q9 {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the first string is the common prefix
        String prefix = strs[0];

        // Loop through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character each time
                prefix = prefix.substring(0, prefix.length() - 1);
                // If no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs)); // Output: "fl"
    }
}
