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

public class Question2Version {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int a=Integer.parseInt(line);
        String[] array=new String[a];
        int i=0;
        int[][] count=new int[a][26];
        while((line=input.readLine())!=null && i<a){
            array[i]=line.trim();

            for(char c: array[i].toCharArray()){
                count[i][c-'a']++;
            }
            i++;

        }
        input.close();
        int maxGroup=0;
        int temp;
        for(int m=0;m<a;m++){
            temp=0;
            for(int n=m+1;n<a;n++){
                if(Arrays.equals(count[m],count[n]))
                    temp++;
            }
            if(++temp>maxGroup)
                maxGroup=temp;
        }

        System.out.println(maxGroup);
    }
}
