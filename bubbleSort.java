import java.util.*;
public class bubbleSort {

    public static void bubblesort(int arr[])
    {
        int jc=1;
        while(jc<=arr.length-1)
        {
            for(int i=0;i<arr.length-jc;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            jc++;
        }
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={10,15,2,-1,7};
        bubblesort(arr);
    }

}