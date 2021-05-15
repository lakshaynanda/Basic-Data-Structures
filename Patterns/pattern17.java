import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int nst = 1;
        int nsp = n / 2;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*	");
                } else {
                    System.out.print("	"); 
                }
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*	");
            }
            if (i <= n/2) {
                nst++;
            } else {
                nst--;
            }
            System.out.println();
        }
    }
}