import java.util.*;
public class matriixmult {
    public static Scanner sc=new Scanner(System.in);
    public static void input(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] mult(int arr1[][],int arr2[][])
    {
        int res[][]=new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2[0].length;j++)
            {
                for(int k=0;k<arr1[0].length;k++)
                {
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        int arr1[][]={
            {1,2},
            {3,4},
        };
        int arr2[][]={
            {5,6},
            {7,8}
        };

        int res[][]=mult(arr1, arr2);
        display(res);
        
    }
}