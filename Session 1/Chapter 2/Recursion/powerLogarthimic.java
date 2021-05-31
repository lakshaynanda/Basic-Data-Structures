import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if (n <= 0) {
            return 1;
        }
        int ans = 0;
        if(n % 2 == 0) {
            int val = power(x, n/2);
            ans = val * val;
            
        } else {
            int val = power(x, n/2);
            ans = val * val * x;
        }
        return ans;
    }

}