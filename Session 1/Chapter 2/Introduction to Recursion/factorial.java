import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 1) {
            return 1;
        }
        int res = n * factorial(n - 1);
        return res;
    }

}