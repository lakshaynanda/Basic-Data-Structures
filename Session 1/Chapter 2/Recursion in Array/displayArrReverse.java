import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = n - 1;
        displayArr(arr, idx);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == -1) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx - 1);
    }

}