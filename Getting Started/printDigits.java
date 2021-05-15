import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int count = 1;
      int ans = 0;
      int back = n;
      while (n >= 10) {
        n = n / 10;
        count *= 10;
      }
      while (count != 0) {
        int rem = back / count;
        System.out.println(rem);
        
        back = back % count;
        count = count / 10;
      }
     }
    }