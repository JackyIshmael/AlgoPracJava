package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: bianli
 * @author: Jacky
 * @create: 2020-08-02 20:38
 **/
public class Pinduoduo3 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        String temp1[]=line.split("\\s+");
        int N=Integer.parseInt(temp1[0]);
        int M=Integer.parseInt(temp1[1]);
        int T=Integer.parseInt(temp1[2]);
        int count=0;

        Map<Integer,Integer> mapLunch=new HashMap<>();
        Map<Integer,Integer> mapDinner=new HashMap<>();
        int[] meiweiLunch=new int[N];
        int[] meiweiDinner=new int[M];

        while(count<N){
            line=input.readLine();
            String[] temp=line.split("\\s+");
            if(mapLunch.containsKey(Integer.parseInt(temp[1]))&& mapLunch.get(Integer.parseInt(temp[1]))>Integer.parseInt(temp[0]))
                    mapLunch.put(Integer.parseInt(temp[1]),Integer.parseInt(temp[0]));

            mapLunch.put(Integer.parseInt(temp[1]),Integer.parseInt(temp[0]));
            meiweiLunch[count]=Integer.parseInt(temp[1]);
            count++;
        }
        count=0;
        while(count<M){
            line=input.readLine();
            String[] temp=line.split("\\s+");
            mapDinner.put(Integer.parseInt(temp[1]),Integer.parseInt(temp[0]));
            meiweiDinner[count]=Integer.parseInt(temp[1]);
            count++;
        }
        int min=200000;
        for(int i=0;i<N;i++){
            if(meiweiLunch[i]>=T){
                if(min> mapLunch.get(meiweiLunch[i])){
                    min=mapLunch.get(meiweiLunch[i]);
                }
            }
        }
        for(int i=0;i<M;i++){
            if(meiweiDinner[i]>=T){
                if(min> mapDinner.get(meiweiDinner[i])){
                    min=mapDinner.get(meiweiDinner[i]);
                }
            }
        }


        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(meiweiLunch[i]+meiweiDinner[j]>=T){
                    if(min> (mapLunch.get(meiweiLunch[i])+mapDinner.get(meiweiDinner[j]))){
                        min=(mapLunch.get(meiweiLunch[i])+mapDinner.get(meiweiDinner[j]));
                    }
                }
            }
        }
        if(T==0)
            min=0;
        if(min==200000)
            min=-1;
        System.out.println(min);


    }
}
