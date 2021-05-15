import java.util.*;
  
  public class isPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      if (t == 1 || t == 0) {
          System.out.println("not prime");
      } else {
        for(int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0;
            for(int div = 2; div*div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
            System.out.println("not prime"); 
            }
        }
      }
       // write ur code here
   }
  }