package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: wu
 * @author: Jacky
 * @create: 2020-08-02 19:01
 **/
public class Pinduoduo1 {

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String temp1[]=input.readLine().split("\\s+");
        int k=Integer.parseInt(temp1[0]);
        int n=Integer.parseInt(temp1[1]);
        String temp2[]=input.readLine().split("\\s+");
        int[] walk=new int[n];
        for(int i=0;i<temp2.length;i++){
            walk[i]=Integer.parseInt(temp2[i]);
        }

        int dis=k;
        int back=0;
        for(int i=0;i<walk.length;i++){
             if(walk[i]<dis){
                 dis=dis-walk[i];
                 continue;
             }
             else if(walk[i]==dis){
                 System.out.println("paradox");
                 return;
             }
             else{
                 dis=walk[i]-dis;
                 back++;
             }
        }
        String sentence = dis + " " + back;
        System.out.println(sentence);




    }
}
