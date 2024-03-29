import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            int smallestJ = 0;
            for(int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][smallestJ]) {
                    smallestJ = j;
                }
            }
            boolean flag = true;
            for(int k = 0; k < arr.length; k++) {
                if (arr[k][smallestJ] > arr[i][smallestJ]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i][smallestJ]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}