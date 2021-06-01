import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        toh(n, t1, t2, t3);
    }

    public static void toh(int n, int t1, int t2, int t3){
        if(n==0){
            return;
        }
        toh(n-1, t1,t3,t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        toh(n-1, t3, t2, t1);
    }

}