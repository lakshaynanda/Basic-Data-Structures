import java.util.*;
public class wave {

    public static void wavePrint(int arr[][])
    {
        for(int col=0;col<arr[0].length;col++)
        {
            if(col%2==0)
            {
                for(int row=0;row<arr.length;row++)
                {
                    System.out.print(arr[row][col]+" ");
                }
            }
            else
            {
                for(int row=arr.length-1;row>=0;row--)
                {
                    System.out.print(arr[row][col]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={
            {11,12,13,14},
            {15,16,17,18},
            {19,20,21,22},
            {23,24,25,26}
        };
        wavePrint(arr);
    }

}