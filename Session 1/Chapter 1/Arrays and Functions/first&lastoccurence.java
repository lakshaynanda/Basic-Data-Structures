import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    
    for (int i = 0; i <a.length; i++) {
        a[i] = sc.nextInt();
    }
    int last_index = -1;
    int first_index = -1;
    int data = sc.nextInt();
    int start = 0;
    int end = a.length - 1;
    while (start <= end) {
        int mid = (start+end)/2;
        if(data > a[mid]) {
            start = mid + 1;
        } else if (data < a[mid]) {
            end = mid - 1;
        } else {
            last_index = mid;
            start = mid + 1;
        }
    }
    start = 0;
    end = a.length - 1;
    while (start <= end) {
        int mid = (start+end)/2;
        if(data > a[mid]) {
            start = mid + 1;
        } else if (data < a[mid]) {
            end = mid - 1;
        } else {
            first_index = mid;
            end = mid - 1;
        }
    } 
    System.out.println(first_index);
    System.out.println(last_index);
 }

}