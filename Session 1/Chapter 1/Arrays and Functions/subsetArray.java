import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    
    for(int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt(); 
    }
    
    int limit = (int)Math.pow(2, a.length);
    
    for(int i = 0; i < limit; i++) {
        String set = "";
        int temp = i;
        for(int j = a.length - 1; j >= 0; j--) {
            int r = temp % 2;
            temp /= 2;
            
            if (r == 0) {
                set  = ("-\t" + set);
            } else {
                set = (a[j] + "\t" + set);
            }
        }
        System.out.println(set);
    }
 }
}