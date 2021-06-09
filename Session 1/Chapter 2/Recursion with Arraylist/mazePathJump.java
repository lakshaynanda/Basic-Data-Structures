import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    // ms - move size
    // msv - move size vertical
    // msvh - move size diagonal
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for(String hpath: hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        for(int msv = 1; msv <= dr - sr; msv++) {
            ArrayList<String> vpaths = getMazePaths(sr + msv, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("v" + msv + vpath);
            }
        }
        for(int msvh = 1; msvh <= dr - sr && msvh <= dc - sc; msvh++) {
            ArrayList<String> diag = getMazePaths(sr + msvh, sc + msvh, dr, dc);
            for(String dia: diag){
                paths.add("d" + msvh + dia);
            }
        }
        return paths;
    }

}