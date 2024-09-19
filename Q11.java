import java.util.*;

public class Q11 {
    
    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);  // Sort to handle duplicates (if any)
        boolean[] used = new boolean[s.length()];  // To track used characters
        StringBuilder current = new StringBuilder();
        backtrack(result, chars, current, used);
        return result;
    }

    private static void backtrack(List<String> result, char[] chars, StringBuilder current, boolean[] used) {
        // Base case: if the current permutation is complete, add it to the result list
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // Skip already used characters or skip duplicate characters
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue;
            }
            
            // Mark the character as used and add it to the current permutation
            used[i] = true;
            current.append(chars[i]);

            // Recursive call to continue building the permutation
            backtrack(result, chars, current, used);

            // Backtrack: remove the character and mark it as unused
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = permute(s);

        // Print the permutations
        System.out.println(permutations);
    }
}
