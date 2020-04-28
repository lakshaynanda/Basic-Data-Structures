import java.util.*;
public class insertionSort {

    public static void insertionsort(int arr[])
    {
        int jc=1;
        while(jc<=arr.length-1)
        {
            for(int i=jc;i>0;i--)
            {
                if(arr[i]<arr[i-1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }else
                {
                    break;
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
        insertionsort(arr);
    }

}