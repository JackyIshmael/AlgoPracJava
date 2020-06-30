package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/find-the-duplicate-number/
 * @author: Jacky
 * @create: 2020-06-26 12:04
 **/
public class FindtheDuplicateNumber {

    public int findDuplicate(int[] nums){
        int n=nums.length-1;

        int[] countNums=new int[n];

        for(int i:nums){
            countNums[i]++;
            if(countNums[i]>=2) return i;
        }
        return 0;
    }

}
