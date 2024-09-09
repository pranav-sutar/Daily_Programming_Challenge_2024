import java.util.*;

public class SortArr {

    public static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        sort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
