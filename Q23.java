import java.util.*;

public class Q23 {

    public static int[] findSlidingWindowMax(int[] arr, int k) {
        if (arr == null || k <= 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from deque that are outside the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements from deque that are smaller than the current element
            // because they will never be the maximum in this window or any future window
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add the current element index to deque
            deque.offer(i);

            // The first index where a result is produced is when i >= k - 1
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = findSlidingWindowMax(arr, k);
        System.out.println(Arrays.toString(result));  // Output: [3, 3, 5, 5, 6, 7]
    }
}
