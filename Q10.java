import java.util.*;

public class Q10 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store the groups of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert each string to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Convert sorted char array back to string (this will be the key)
            String sortedStr = new String(charArray);

            // Add the original string to the list corresponding to the sorted key
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        // Return the values (the grouped anagrams)
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        // Print the grouped anagrams
        System.out.println(result);
    }
}
