package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * @author: Jacky
 * @create: 2020-05-18 10:35
 **/
public class FindAllAnagramsInaString {

    public List<Integer> find_HashMapVersion(String s, String p){
        List<Integer> ans=new ArrayList();

        //用于循环或者是匹配。
        int lengthS=s.length(),lengthP=p.length();
        //模板
        Map<Character,Integer> pCount=new HashMap();
        //检测对象
        Map<Character,Integer> sCount=new HashMap();
        //创建HashMap或者长度为26的数组来模式化记录字符串中字母的出现次数。

        //对字符串s搜索。
        for(char c : p.toCharArray()){
            if(pCount.containsKey(c))
                pCount.put(c,pCount.get(c)+1);
            else
                pCount.put(c,1);
        }


        for(int i=0;i<lengthS;i++){

            char testChar=s.charAt(i);

            //将当前i对应的字母加入到对比窗口sCount中
            if(sCount.containsKey(testChar)) {
                sCount.put(testChar, sCount.get(testChar) + 1);
            }
            else
                sCount.put(testChar,1);


            if(i>=lengthP){
                //说明整个窗口在初始填充完毕的情况下向右移动了一个格，需要将之前的第一个格子从map中删除
                //将字符对应到即将移动的窗口的第一个字母。
                testChar=s.charAt(i-lengthP);
                if(sCount.get(testChar)==1)
                    sCount.remove(testChar);
                else
                    sCount.put(testChar,sCount.get(testChar)-1);
            }

            //如果当前新移动的窗口符合条件
            if(sCount.equals(pCount)){
                ans.add(i-lengthP+1);
            }

        }
        return ans;
    }

    private List<Integer> find_ArrayVersion(String s, String p){
        //数组当作窗口，
        //先统计p中每个字母出现的次数。
        //再根据p的长度，将其作为窗口在S上移动，每一次迭代做好新字母的加入和旧字母的删除。
        //作判断，如果当前的sCount和pCount相等，那么就将当前窗口第一个字母的位置添加到output的list中

        List<Integer> ans=new ArrayList();
        int lengthS=s.length(),lengthP=p.length();

        int[] pCount=new int[26];
        int[] sCount=new int[26];

        for(char testChar: p.toCharArray()){
            pCount[(testChar-'a')]++;
        }

        for(int i=0;i<lengthS;i++){
            //先读进新的下一个字符
            char ch=s.charAt(i);
            sCount[ch-'a']++;

            //检测窗口是否在移动
            if(i>=lengthP){
                ch=s.charAt(i-lengthP);
                sCount[(ch-'a')]--;
            }

            if(Arrays.equals(pCount,sCount))
                ans.add(i-lengthP+1);
        }
        return ans;



    }

}
