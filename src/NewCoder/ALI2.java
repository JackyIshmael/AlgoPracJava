package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: aa
 * @author: Jacky
 * @create: 2020-07-20 19:20
 **/
public class ALI2 {
    public static void main(String[] args) throws IOException{
        int right=1000;
        int left=1;
        int l=right-left+1;
        //List<Integer> e=new ArrayList<>();
        //List<Integer> o=new ArrayList<>();
        int o_horizon=(int)(l/2+0.5);
        int e_horizon=(int)(l/2);
        int[] o=new int[o_horizon];
        int[] e=new int[e_horizon];
        System.out.println(o_horizon);
        System.out.println(e_horizon);

        for(int i=left;i<o_horizon;i++){
            o[i]=(2*i-1);
        }

        for(int i=left;i<e_horizon;i++){
            e[i]=(2*i);
        }
//
//        for(int m=0;m<e.size();m++){
//            if(Math.abs(o.-e[m])==7)
//
//        }


    }

}
