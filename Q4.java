import java.util.Arrays;

public class Q4 {

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1; 
        int j = 0;     

        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
           
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}; 
        int[] arr2 = {2, 4, 6, 8}; 

        int m = arr1.length; 
        int n = arr2.length; 

        merge(arr1, arr2, m, n);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
