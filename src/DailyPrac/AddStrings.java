package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode-cn.com/problems/add-strings/
 * @author: Jacky
 * @create: 2020-08-03 14:11
 **/
public class AddStrings {

    //题目的核心是，用字符串 实现大数相加！！！！！！！！！！！
    public static void main(String[] args){


        String num1="1234";
        String num2= "123";

        int len1=num1.length();
        int len2=num2.length();

        int i=len1-1;
        int j=len2-1;

        int add=0;

        StringBuffer sum= new StringBuffer();
        while(i>=0||j>=0||add!=0){
            int x= i>=0? num1.charAt(i)-'0':0;
            int y= j>=0? num2.charAt(j)-'0':0;
            int temp=x+y+add;
            sum.append(temp%10);
            add=temp/10;
            i--;
            j--;
        }
        sum.reverse();
        System.out.println(sum.toString());

    }




    //注意，测试数据里面有非常大的数字导致int无法完全表示，同时题目要求禁用BigInteger库。因此需要在字符串的基础上运算
    //java中int32位，2的31位表示的最大数值为4,294,967,296 。只要字符串超过10位就会炸。
    public static int stringToint(String input){
        int len=input.length();
        int count=len-1;
        int sum=0;

        for(char c: input.toCharArray()){
            sum=(int)(sum+(c-'0')* Math.pow((double)10,(double)count));
            count--;
        }
        return sum;
    }
}
