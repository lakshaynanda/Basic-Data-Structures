import java.util.*;
public class maxInArray {

    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }        
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,17,21,5,6};
        System.out.println(max(arr));
    }
}