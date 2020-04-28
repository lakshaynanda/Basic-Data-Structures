import java.util.*;
public class reverseArray {

    public static void reverse(int arr[])
    {
        int []reversed=new int[arr.length-1];
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        reverse(arr);
    }
}