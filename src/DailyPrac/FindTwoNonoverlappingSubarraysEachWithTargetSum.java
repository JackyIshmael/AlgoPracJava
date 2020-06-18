package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: 5423. Find Two Non-overlapping Sub-arrays Each With Target Sum
 * @author: Jacky
 * @create: 2020-06-13 23:02
 **/
public class FindTwoNonoverlappingSubarraysEachWithTargetSum {

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }

    public static int minoflength(int[] arr, int target) {
        List<Integer> ans1=new ArrayList();
        int minumLength1=10^5;
        int minumPointer1=-1;
        int flag=0;
        int sumtest=0;
        for(int curr=0;curr<arr.length;curr++){
            if (arr[curr]==0||arr[curr]>target){
                ans1.clear();
                sumtest=0;
                continue;
            }

            if(arr[curr]==target){
                ans1.clear();
                ans1.add(arr[curr]);
                arr[curr]=0;
                minumLength1=1;
                minumPointer1=curr;
                break;
            }

            if(arr[curr]<target)
            {
                if(ans1.isEmpty()){
                    ans1.add(arr[curr]);
                    sumtest+=arr[curr];
                    flag=curr;
                }
                else{
                    int test=sumtest+arr[curr];
                    if(test==target){
                        ans1.add(arr[curr]);
                        if(ans1.size()<minumLength1){
                            minumLength1=ans1.size();
                            minumPointer1=curr;
                            ans1.clear();
                            sumtest=0;
                        }
                        else{
                            //丢分点1.回弹。BASE条件没有找到，就是你确定了当前子序列不正确之后，下一个要研究的对象的起始点位置需要进行修正。
                            ans1.clear();
                            sumtest=0;
                            curr=flag;
                        }
                    }
                    else if(test>target){
                        ans1.clear();
                        sumtest=0;
                        curr=flag;
                        continue;
                    }
                    else if(test<target){
                        ans1.add(arr[curr]);
                        sumtest+=arr[curr];
                    }
                }
            }

        }
        System.out.println(minumPointer1);
        if(minumPointer1==-1){
            return -1;
        }
        else{
            for(int j=minumPointer1;j>minumPointer1-minumLength1;j--)
                arr[j]=0;
            return minumLength1;
        }

    }

    public static int minSumOfLengths(int[] arr, int target) {
        int leng1=minoflength(arr, target);
        int leng2=minoflength(arr, target);

        if(leng1==-1 || leng2==-1){
            return -1;
        }
        else
            return leng1+leng2;
    }
    public static void main(String[] args){
        int[] array={2,2,4,4,2,2};
        int target=8;
        int ans=minSumOfLengths(array,target);
        System.out.println(ans);
    }
}
