import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // write ur code here
    int nsp = 2*n-3;
    int nst = 1;
    
    for(int i = 1; i <= n; i++) {
        int val = 1;
        for(int j = 1; j <= nst; j++) {
            System.out.print(val + "	");
            val++;
        }
        for(int j = 1; j <= nsp; j++) {
            System.out.print("	");
        }
        if (i == n) {
            nst--;
            val--;
        }
        for(int j = 1; j <= nst; j++) {
            val--;
            System.out.print(val + "	");
        }
        nst++;
        nsp -= 2;
        System.out.println();
    }
    
 }
}