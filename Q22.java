import java.util.HashMap;

public class Q22 {

    public static int findFirstElement(int[] arr, int k) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // First, count the occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Then, check for the first element that appears exactly k times
        for (int num : arr) {
            if (frequencyMap.get(num) == k) {
                return num;
            }
        }
        
        // If no element is found that repeats exactly k times, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        
        int result = findFirstElement(arr, k);
        System.out.println(result);  // Output: 1
    }
}
