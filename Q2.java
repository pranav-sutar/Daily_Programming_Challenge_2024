
import java.util.*;
public class Q2 {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of ele: ");
        int n = sc.nextInt();
        System.out.printf("Enter %d elements of  array: ",n-1);
        int arr[]=new int[n];
        for(int i=0; i<n-1; i++){
            arr[i]=sc.nextInt();
        }
        

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missingNumber);  // Output: Missing Number: 3
    }
}
