package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/sort-colors/
 * @author: Jacky
 * @create: 2020-06-12 12:35
 **/
public class SortColors {

    public void sortColors(int[] nums) {

        int[] numsCount=new int[3];

        for(int i=0; i<nums.length; i++){

            if(nums[i]==0)
                numsCount[0]++;
            else if(nums[i]==1)
                numsCount[1]++;
            else if(nums[i]==2)
                numsCount[2]++;
        }

        for(int i=0;i<nums.length;i++){

            if(numsCount[0]!=0){
                nums[i]=0;
                numsCount[0]--;
                continue;
            }
            else if(numsCount[0]==0 && numsCount[1]!=0){
                nums[i]=1;
                numsCount[1]--;
                continue;
            }
            else if(numsCount[0]==0 && numsCount[1]==0){
                nums[i]=2;
                numsCount[2]--;
            }

        }

    }
}
