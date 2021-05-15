import java.util.*;
  
  public class Main{
    public static int anyToany(int n, int b1, int b2) {
        int decVal = anyToDec(n, b1);
        int finVal = decToAny(decVal, b2);
        return finVal;
    }
    
    public static int anyToDec (int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % 10;
            rv += digit * p;
            p *= b;
            n = n / 10;
        }
        return rv;
    }
    public static int decToAny (int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % b;
            rv += digit * p;
            p *= 10;
            n = n / b;
        }
        return rv;
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      System.out.print(anyToany(n, sourceBase, destBase));
   }
  }