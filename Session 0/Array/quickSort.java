import java.util.*;
public class quickSort {


    public static void quicksort(int arr[],int hi,int lo)
    {
        if(lo>=hi)
        {
            return;
        }
        int pivot=arr[hi];
        int pvtIdx=partition(arr,lo,hi,pivot);
        quicksort(arr, pvtIdx-1, lo);
        quicksort(arr, hi, pvtIdx+1);
    }

    public static int partition(int arr[],int lo,int hi,int pivot)
    {
        int prtIdx=lo;
        int itr=lo;

        while(itr<=hi)
        {
            if(arr[itr]<=pivot)
            {
                int temp=arr[prtIdx];
                arr[prtIdx]=arr[itr];
                arr[itr]=temp;

                itr++;
                prtIdx++;
            }
            else
            {
                itr++;
            }
        }
        return prtIdx-1;
    }
    public static void main(String args[])
    {
        int arr[]={0,11,6,1,8,7,9,4,3,15,5};
        quicksort(arr, arr.length-1,0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}