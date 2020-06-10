package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/is-subsequence/
 * @author: Jacky
 * @create: 2020-06-10 13:03
 **/
public class IsSubsequence {
    //判断字符串是否是子序列地问题
    //Both strings consists only of lowercase characters.
    //因此用array就可以求解?

    //难点在于，保证字符串s的顺序。
    //这样就不能用Count了，因为我只保留了它的集合而失去了次序属性。

    //由于T串非常长，不可能在t中搜索s的每个字符。是否有更快的方法。

    //一种思路，在t中找到s的某个字符之后，将t之前的数组全部删去


    public static boolean isSubsequence(String s, String t){

        int find=0;
        for(char c:s.toCharArray()){

            find=t.indexOf(c,find);
            if(find==-1)
                return false;
            if(find+1>t.length())
                return false;
            System.out.println(find);
            find=find+1;
        }

        return true;
    }

    public static void main(String[]args){
        String s="aaaaaa";
        String t="bbaaaa";
        isSubsequence(s,t);
    }
}
