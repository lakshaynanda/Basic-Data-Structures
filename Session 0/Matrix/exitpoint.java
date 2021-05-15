import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class exitpoint {

    public static void exitPoint(int arr[][])
    {
        int r=0;
        int c=0;
        int dir=0; //0=east,1=south,2=west,3=north 

        while(true)
        {
            dir=(dir+arr[r][c])%4;

            int nr=r;
            int nc=c;

            if(dir==0)
            {
                nc++;
            }
            else if(dir==1)
            {
                nr++;
            }else if(dir==2)
            {
                nc--;
            }
            else{
                nr--;
            }

            if(nr<0 || nr>=arr.length || nc<0 || nc>=arr.length)
            {
                System.out.println(r+" "+c);
                break;
            }
            else
            {
                r=nr;
                c=nc;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {0,0,1,0},
            {1,0,0,0},
            {0,0,0,0},
            {1,0,1,0}
        };

        exitPoint(arr);
    }

}