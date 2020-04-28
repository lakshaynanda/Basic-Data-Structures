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

    public static boolean mirrorinverse(int arr[])
    {
        int []inversed=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            if(arr[val]!=i)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        int arr[]={3,4,2,0,1};
        System.out.println(mirrorinverse(arr));

    }
}