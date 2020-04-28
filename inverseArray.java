import java.util.*;
public class inverseArray {

    public static int[] inversearray(int arr[])
    {
        int []inversed=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            inversed[val]=i;
        }
        return inversed;
    }

    public static void main(String args[])
    {
        int arr[]={3,0,1,4,2};
        int []in=inversearray(arr);
        for(int val:in)
        {
            System.out.print(val+" ");
        }

    }
}