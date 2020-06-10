package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/search-insert-position/
 * @author: Jacky
 * @create: 2020-06-10 17:03
 **/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        int mid=0;

        while(low<=high){
            if(target>nums[nums.length-1]) return nums.length;
            if(target<nums[0]) return 0;

            mid=(high+low)/2;

            if(target==nums[mid]) return mid;

            if(target>nums[mid]){
                if(target<=nums[mid+1])
                    return mid+1;
                low=mid;
                continue;
            }
            if(target<nums[mid]){
                if(mid==0) return 0;
                if(target>nums[mid-1])
                    return mid;
                else if(target==nums[mid-1])
                    return mid-1;
                high=mid;
                continue;
            }
        }
        return -1;
    }
}
