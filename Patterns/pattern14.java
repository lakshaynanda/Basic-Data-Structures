import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for(int i = 1; i <= 10; i++) {
            int val = n*i;
            System.out.println(n + " * " + i + " = " + val);
        }
    }
}