package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/H
 * @author: Jacky
 * @create: 2020-06-18 01:11
 **/

//排序用JAVA自身的collection库就可以完成

public class Question2 {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int a=Integer.parseInt(line);
        //System.out.println(a);
        String[] array=new String[a];
        int i=0;
        HashMap[] test=new HashMap[a];

        while((line=input.readLine())!=null && i<a){
            array[i]=line.trim();
            test[i] =new HashMap<Character, Integer>();

            for(char c: array[i].toCharArray()){
                if(test[i].containsKey(c))
                    test[i].put(c,(int)test[i].get(c)+1);
                else
                    test[i].put(c,1);
            }
            i++;

        }
        input.close();
        int maxGroup=0;
        int temp;
        for(int m=0;m<a;m++){
            temp=0;
            for(int n=m+1;n<a;n++){
                if(test[m].equals(test[n]))
                    temp++;
            }
            if(++temp>maxGroup)
                maxGroup=temp;
        }

        System.out.println(maxGroup);
    }
}
