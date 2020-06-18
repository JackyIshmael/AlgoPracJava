package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/implement-strstr/
 * @author: Jacky
 * @create: 2020-06-18 17:13
 **/
public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;

        //滑动窗口
        for(int i=0;i<haystack.length()-needle.length();i++){

            for(int j=0;j<needle.length();j++){
                //j+i表示 滑动窗口的移动座标
                if(haystack.charAt(j+i)!=needle.charAt(j))
                    break;
                if(j==needle.length()-1)
                    return i;
            }
        }
        return -1;
    }



    public static void main(String[] args){
        String haystack="a";
        String needle="a";

        System.out.println(strStr(haystack,needle));
    }
}
