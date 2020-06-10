package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/permutation-in-string/
 * @author: Jacky
 * @create: 2020-05-18 23:26
 **/
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] countS1=new int[26];
        int[] countS2=new int[26];


        int lengthS1=s1.length(),lengthS2=s2.length();
        //滑动窗口方法。
        //判断s1是否有s2的一个子集
        for(char testChar : s1.toCharArray()){
            countS1[testChar-'a']++;
        }

        for(int i=0;i<lengthS2;i++){

            char testChar=s2.charAt(i);
            //对应s2的统计表加一
            countS2[testChar-'a']++;

            if(i>=lengthS1){
                //锁定窗口头的字母
                testChar=s2.charAt(i-lengthS1);
                countS2[testChar-'a']--;
            }

            if(Arrays.equals(countS1,countS2))
                return true;
        }
        return false;
    }

}
