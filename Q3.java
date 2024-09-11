import java.util.*;
public class Q3 {
    public static int Duplicate(int[] arr) {
        
        int one = arr[0];
        int two = arr[0];
        
        do {
            one = arr[one]; 
            two = arr[arr[two]];    
        } while (one != two);
        
        one = arr[0];  
        while (one != two) {
            one = arr[one]; 
            two = arr[two];        
        }
   
        return two;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements (n+1): ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements(with duplicate): ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Number: " + Duplicate(arr));
    }
}
