import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minR = 0;
        int maxR = arr.length - 1;
        int minC = 0;
        int maxC = arr[0].length - 1;
        int total = n * m;
        int count = 0;
        
        while (count < total) {
            for(int i = minR, j = minC; i <= maxR && count < total; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minC++;
            for(int i = maxR, j = minC; j <= maxC && count < total; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxR--;
            for(int i = maxR, j = maxC; i >= minR && count < total; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxC--;
            for(int i = minR, j = maxC; j >= minC && count < total; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minR++;
        }
    }

}