import java.util.*;
public class selectionSort {

    public static void selectionsort(int arr[])
    {
        int jc=1;
        while(jc<=arr.length-1)
        {
            for(int i=jc;i<arr.length;i++)
            {
                if(arr[i]<arr[jc-1])
                {
                    int temp=arr[i];
                    arr[i]=arr[jc-1];
                    arr[jc-1]=temp;
                }
            }
            jc++;
        }
        for(int va:arr)
        {
            System.out.print(va+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={10,15,2,-1,7};
        selectionsort(arr);
    }
}