import java.util.*;
public class rotatearray {

    public static void arrayrotate(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int d=3;

        arrayrotate(arr, 0, arr.length-d-1);
        arrayrotate(arr, arr.length-d, arr.length-1);
        arrayrotate(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}