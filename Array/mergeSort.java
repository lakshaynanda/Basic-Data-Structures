import java.util.*;
public class mergeSort {

    public static int[] merge(int[] one,int two[])
    {
        int mergedArray[]=new int[one.length+two.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<one.length && j<two.length)
        {
            if(one[i]<two[j])
            {
                mergedArray[k]=one[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k]=two[j];
                j++;
                k++;
            }
        }
        while(j<two.length)
        {
            mergedArray[k]=two[j];
            j++;
            k++;
        }
        while(i<one.length)
        {
            mergedArray[k]=one[i];
            i++;
            k++;
        }
        return mergedArray;
    }
    public static int[] mergesort(int arr[],int lo,int hi)
    {
        if(hi==lo)
        {
            int[] baseArr=new int[1];
            baseArr[0]=arr[hi];
            return baseArr;
        }
        int mid=(hi+lo)/2;
        int []fhalf=mergesort(arr,lo,mid);
        int []shalf=mergesort(arr,mid+1, hi);

        int sorted[]=merge(fhalf, shalf);
        return sorted;
    }
    public static void main(String args[])
    {
        // int[] one={2,5,9,15,19,20};
        // int[] two={0,3,7,8,11};
        int arr[]={2,1,0,5,9,6,3,7};
        int []mergeArr=mergesort(arr,0,arr.length-1);
        for(int i=0;i<mergeArr.length;i++){
            System.out.print(mergeArr[i]+" ");
        }
        
    }

}