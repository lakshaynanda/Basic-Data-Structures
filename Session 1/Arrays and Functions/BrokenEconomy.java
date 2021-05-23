import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int d = sc.nextInt();
    int high = arr.length - 1;
    int low = 0;
    int middle = 0;
    int ceil = Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;
    while (high >= low) {
        middle = (high + low) / 2;
        if (d > arr[middle]) {
            low = middle + 1;
            floor = arr[middle];
        } else if (d < arr[middle]) {
            high = middle - 1;
            ceil = arr[middle];
        } else {
           ceil = floor = arr[middle];
           break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}