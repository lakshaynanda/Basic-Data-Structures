import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int nst = 1;
    int osp = n / 2;
    int isp = -1;
     // write ur code here
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= osp; j++) {
            System.out.print("	");
        }
        System.out.print("*	");
        for(int j = 1; j <= isp; j++) {
            System.out.print("	");
        }
        
        if (i > 1 && i < n) {
            System.out.print("*");
        }
        if (i <= n / 2) {
            osp--;
            isp += 2;
        } else {
            osp++;
            isp -= 2;
        }
        System.out.println();
    }
 }
}