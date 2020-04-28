import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class searchAlgo {

    public static int binarysearch(int arr[], int data) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data == arr[mid]) {
                return mid;
            } else {
                hi=mid-1;
            }
        }
        return -1;
    }
    public static int linearsearch(int arr[],int data)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 5, 12, 2, 6, 7 };
        System.out.println(binarysearch(arr,12));

    }

}