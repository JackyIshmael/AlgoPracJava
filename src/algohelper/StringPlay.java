package algohelper;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 123
 * @author: Jacky
 * @create: 2020-06-28 10:49
 **/
public class StringPlay implements Comparable<StringPlay>
{
    @Override
    public int compareTo(StringPlay o){

    }

    public static void main(String[] args){
        String a= new String("ab");
        String b= new String("ab");
        String aa="ab";
        String bb="ab";



        if(aa==bb)
            System.out.println("aa=bb");

        if(a==b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("aEQb");
        if(a==bb)
            System.out.println("a==bb");



    }
}
