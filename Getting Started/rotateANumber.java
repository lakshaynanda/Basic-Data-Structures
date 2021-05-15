import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     int k = sc.nextInt();
     
     int temp = n;
     int nod = 0;
     
     while (temp != 0) {
        temp /= 10;
        nod++;
     }
     k = k % nod;
     if (k < 0) {
        k = k + nod;
     }
     
     int div = 1;
     int mul = 1;
     
     for(int i = 1; i <= nod; i++) {
        if (i <= k) {
            div = div * 10;
        } else {
            mul = mul * 10;
        }
     }
     int ans = 0;
     int rem = n % div;
     int val = n / div;
     
     ans = rem * mul + val;
     System.out.println(ans);
    }
   }