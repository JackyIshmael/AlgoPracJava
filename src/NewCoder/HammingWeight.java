package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: LeetCode 191
 * @author: Jacky
 * @create: 2020-07-24 20:08
 **/
public class HammingWeight {
    public static void main(String[] args) throws  IOException{

        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int num=Integer.parseInt(line);

        System.out.println(hammingWeight(num));
    }

    public static int hammingWeight(int num){
        int res=0;
        while(num!=0){
            res+=(num & 0x1);
            num=num>>>1;
        }
        return res;
    }
}
