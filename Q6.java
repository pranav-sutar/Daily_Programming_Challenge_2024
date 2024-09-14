import java.util.*;

public class Q6 {


    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();


        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();


        int sum = 0;

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                List<Integer> list = sumMap.get(sum);

                for (int index : list) {
                    result.add(new int[]{index + 1, i});
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

    public static void printSubarrays(List<int[]> subarrays) {
        if (subarrays.isEmpty()) {
            System.out.println("No subarrays with zero sum found.");
        } else {
            for (int[] subarray : subarrays) {
                System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, 3, -1, 2};


        List<int[]> result = findZeroSumSubarrays(arr);


        printSubarrays(result);
    }
}
