import java.util.*;
public class rotateMatrix {

    public static void rotate(int arr[][])
    {
        transpose(arr);
        colReverse(arr);
    }
    public static void transpose(int arr[][])
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=row;col<arr[0].length;col++)
            {
                swap(arr, row, col, col, row);
            }
        }
    }
    public static void colReverse(int arr[][])
    {
        int lc=0;
        int rc=arr[0].length-1;

        while(lc<rc)
        {
            for(int row=0;row<arr.length;row++)
            {
                swap(arr, row, lc, row, rc);
            }
            lc++;
            rc--;
        }
    }
    public static void swap(int arr[][],int r1,int c1,int r2,int c2)
    {
        int temp=arr[r1][c1];
        arr[r1][c1]=arr[r2][c2];
        arr[r2][c2]=temp;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        rotate(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}