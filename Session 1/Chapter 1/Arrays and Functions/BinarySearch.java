import java.util.*;

public class BinarySearch {
    public static boolean binarySearch (int arr[], int data) {
        int high = arr.length - 1;
        int low = 0;

        while(high >= low) {
            int middle = (high + low) / 2;
            if (data > arr[middle]) {
                low = middle + 1;
            } else if (data < arr[middle]) {
                high = middle - 1; 
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        boolean result = false;
        result = binarySearch(arr, data);
        System.out.println(result);
    }
} 