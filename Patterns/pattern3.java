import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n - 1;
        // write ur code here
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= nsp; j++) {
                System.out.print("	");
            }
            for(int k = 1; k <= nst; k++) {
                System.out.print("*	");
            }
            nst++;
            nsp--;
            System.out.println();
        }

    }
}