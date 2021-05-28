import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    
    int a1[][] = new int[n1][m1];
    
    for (int i = 0; i < a1.length; i++) {
        for(int j = 0; j < a1[0].length; j++) {
            a1[i][j] = sc.nextInt();
        }
    }
    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    
    int a2[][] = new int[n2][m2];
    for (int i = 0; i < a2.length; i++) {
        for(int j = 0; j < a2[0].length; j++) {
            a2[i][j] = sc.nextInt();
        }
    }
    
    if (m1 != n2) {
        System.out.println("Invalid input");
        return;
    }
    
    int result[][] = new int[n1][m2];
    for (int i = 0; i < result.length; i++) {
        for(int j = 0; j < result[0].length; j++) {
            for (int k = 0; k < m1; k++) {
               result[i][j] +=  a1[i][k] * a2[k][j];
            }
        }
    }
    for (int i = 0; i < result.length; i++) {
        for(int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
 }

}