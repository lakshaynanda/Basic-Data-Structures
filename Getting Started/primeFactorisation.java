import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  
  for(int div = 2; div <= n; div++) {
    while (n % div == 0) {
        System.out.print(div + " ");
        n = n / div;
    }
  }
 }
}