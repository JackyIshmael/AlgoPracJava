package DailyPrac;
/****
 *26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates

{

    public static void main(String[] args)
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        //int i=nums.length;
        //用一个j去记录不重复的个数；
        int counter=0;


        for(int i=0; i<(nums.length-1);i++)
        {
            if(nums[i]!=nums[i+1])
            {
                counter++;
                //System.out.println("left is "+nums[i]+" right is"+nums[i+1]);
                nums[counter]=nums[i+1];
            }
        }
        //需要修改原数组。
        //counter表示的是最终程序获取的数组长度，只读取前几个的数据位置。

        //实际提交中修改此处打印为return
        System.out.println(counter+1);
    }

}
