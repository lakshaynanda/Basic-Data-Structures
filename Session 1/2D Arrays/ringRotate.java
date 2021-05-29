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
        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShell(arr, s, r);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void rotateShell (int arr[][], int s, int r) {
        int[] oneD = filledOneDFromShell(arr, s);
        rotate(oneD, r);
        fillShellFromOneD(arr, s, oneD);
    }
    
    public static int[] filledOneDFromShell(int[][] arr, int s) {
        int minR = s - 1;
        int minC = s - 1;
        
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;
        int size = 2 * (maxR - minR + 1) + 2 * (maxC - minC + 1) - 4;
        int oneD[] = new int[size];
        
        int index = 0;
        for(int i = minR, j = minC; i <= maxR; i++) {
            oneD[index] = arr[i][j];
            index++;
        }
        for(int j = minC+1, i = maxR; j <= maxC; j++) {
            oneD[index] = arr[i][j];
            index++;
        }
        for(int i = maxR - 1, j = maxC; i >= minR; i--) {
            oneD[index] = arr[i][j];
            index++;
        }
        for(int j = maxC - 1, i = minR ; j >= minC + 1; j--) {
            oneD[index] = arr[i][j];
            index++;
        }
        return oneD;
    }
    public static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {
        int minR = s - 1;
        int minC = s - 1;
        
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;
        
        int index = 0;
        for(int i = minR, j = minC; i <= maxR; i++) {
            arr[i][j] = oneD[index];
            index++;
        }
        for(int j = minC+1, i = maxR; j <= maxC; j++) {
            arr[i][j] = oneD[index];
            index++;
        }
        for(int i = maxR - 1, j = maxC; i >= minR; i--) {
            arr[i][j] = oneD[index];
            index++;
        }
        for(int j = maxC - 1, i = minR ; j >= minC + 1; j--) {
            arr[i][j] = oneD[index];
            index++;
        }
    }
    public static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if (r < 0) {
            r = r + oneD.length;
        }
        reverse(oneD, 0 , oneD.length - r -1);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }
    public static void reverse(int[] oneD, int start, int end) {
        while(start < end) {
            int temp = oneD[start];
            oneD[start] = oneD[end];
            oneD[end] = temp;
            start++;
            end--;
        }
    }

}