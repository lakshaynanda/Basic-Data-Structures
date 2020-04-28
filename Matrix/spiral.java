import java.util.*;
public class spiral {

    public static void spiralPrint(int arr[][])
    {
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;

        int total=arr.length*arr[0].length;
        int count=1;

        while(count<=total)
        {
            for(int r=sr;r<=er && count<=total;r++)
            {
                System.out.print(arr[r][sc]+" ");
                count++;
            }
            sc++;
            for(int c=sc;c<=ec && count<=total;c++)
            {
                System.out.print(arr[er][c]+" ");
                count++;
            }
            er--;
            for(int r=er;r>=sr && count<=total;r--)
            {
                System.out.print(arr[r][ec]+" ");
                count++;
            }
            ec--;
            for(int c=ec;c>=sc && count<=total;c--)
            {
                System.out.print(arr[sr][c]+" ");
                count++;
            }
            sr++;

        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {11,12,13,14},
            {15,16,17,18},
            {19,20,21,22},
            {23,24,25,26}
        };

        spiralPrint(arr);
    }

}