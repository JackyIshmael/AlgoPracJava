package com.company;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/minimum-window-substring/
 * @author: Jacky
 * @create: 2020-05-24 18:48
 **/
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        //贪心算法？

        //给予字符串S和字符串T，要求在On的时间内，在S中找到包含T中所有字符的最小长度窗口。
        //the length of window is changable


        //如何在每次循环中快速检查 s窗口是否还有t的所有字符。 以及怎么判断放弃当前窗口。
        //因为字符是所有字符，所以现在必须要使用HashMap.

        //Brute force
        Map<Character,Integer> countS=new HashMap<>();
        Map<Character,Integer> countT=new HashMap<>();

        int lengthS=s.length(),lengthT=t.length();

        if(lengthT>lengthS) return null;
        //滑动窗口方法。
        //判断s1是否有s2的一个子集
        for(char testChar : t.toCharArray()){
            if(countT.containsKey(testChar))
                countT.put(testChar,countT.get(testChar)+1);
            else
                countT.put(testChar,1);
        }


        int right=0,left=0;
        int min_length=0;
        int flag=0;
        //每次循环判断s窗口是否全都含有t所要求的字符的数量，这边一个技巧就是hashmap只会记录不重复的词条，因此这边如果用T的长度
        //去判断就没有意义，需要判断S是否满足T的hashmap中所有的词条数量，而满足一条词条的标准就是两者对该词条字符的count数相等
        //T中是可能出现重复字符的。
        int required=countT.size();

        int[] ans={-1,0,0};
        for(right=0;right<lengthS;right++){

            char testChar=s.charAt(right);

            //首先依旧是一直向右增加 S中窗口字符，这边i就相当于右指针
            //另外一种快速增加hash中对应字符count的方法如下
            int count=countS.getOrDefault(testChar,0);
            //获取当前countS中对应测试字符的整数，如果有就取出，没有置为0，然后将count+1添加到hashmap
            countS.put(testChar,count+1);

            //然后判断当前字符加入到窗口后是否该字符与t串匹配。
            if(countT.containsKey(testChar)&& countS.get(testChar).intValue()==countT.get(testChar).intValue())
                //说明S中该字符数量已满足T的要求，后续如果发生大于等于都是没有关系的
                //此时对flag++表示满足了一个词条，直到flag==required时我们
                flag++;

            //查看此时flag是否满足
            //在flag满足的情况下逐步移动窗口左指针。同时要记录合法的当前最短长度和其对应的左右位置。
            //所以需要设置一个单独的ans来保存结果。
            while(left<=right&&flag==required){

                testChar=s.charAt(left);
                //获取当前左边的元素并进行研究。
                //flag==required表明当前窗口已经包含了t所需要的全部字符。
                //在这种情况下，判断当前l到r的距离是否比上一次有效的字符串长度更小，如果更小或者不存在有效的，则记录答案
                if((right-left+1)<ans[0]||ans[0]==-1){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }

                //记录答案后，尝试将最左边的字母删除，并移动窗口尝试寻找
                countS.put(testChar,countS.get(testChar)-1);
                if(countT.containsKey(testChar)&&countS.get(testChar).intValue()<countT.get(testChar).intValue())
                    flag--;
                left++;
            }
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);

    }
}
