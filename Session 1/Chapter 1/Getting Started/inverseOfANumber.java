import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int inverted = 0;
  int op = 1;
  
  while (n > 0) {
    int od = n % 10;
    int id = op;
    int ip = od;
    inverted += (int)Math.pow(10, ip-1) * id;
    n = n / 10;
    op++;
  }
  System.out.println(inverted);
 }
}