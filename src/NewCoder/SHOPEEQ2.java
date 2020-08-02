package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * @author: Jacky想
 * @create: 2020-07-15 10:45
 **/
public class SHOPEEQ2 {


    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int num=Integer.parseInt(line);
        String[] words=input.readLine().split("\\,");

        //System.out.println(Arrays.toString(words));
         Arrays.sort(words, new StringNumber());
         StringBuilder ans=new StringBuilder();
         for(String s: words){
             ans.append(s);
         }
        //System.out.println(Arrays.toString(words));

         System.out.println((ans));


    }

    private static class StringNumber implements Comparator<String>{
        @Override
        public int compare(String left, String right)
        {
            String test1=left+right;
            String test2=right+left;
            //如果 翻转后更大，则 让其sort, 如 210 》 102， 2排到10前。
            return test2.compareTo(test1);

        }

    }

}
