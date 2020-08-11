package DailyPrac;

//令人无语的一道题目
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode-cn.com/problems/find-the-winner-of-an-array-game/
 * @author: Jacky
 * @create: 2020-08-02 14:04
 **/
public class FindTheWinnerOfAnArrayGame {

    public static int getWinner(int[] arr, int k) {
        //他妈的根本不用考虑 移到最后这个东西，因为目的输出只有 那个数字而已
        //只要用一个指针去从左到右扫描数组
        //一个值来存储当前最大值，而且在指针移动的过程中比较次数中出现大情况K次即可输出该值结束函数。且指针左边的元素因为题意完全不用考虑了，也不用考虑循环比较的情况
        //因为你扫过去，肯定取的是最大值，然后如果，数组移动到头，或者说k次到了，直接输出即可。他肯定是全局最大值。

        int maxvalue=arr[0];
        int cur=1;
        int count=0;
        int len=arr.length;
        for(cur=1;cur<len;cur++){
            if(maxvalue>=arr[cur]){
                count++;
            }
            else{
                maxvalue=arr[cur];
                count=1;
            }
            if(count==k)
                return maxvalue;
        }
        return maxvalue;
    }
//


// 下面的方法其实已经，保证了182 / 185 个通过测试用例

    /*
    public static int getWinner(int[] arr, int k) {
        int max=0;
        k = Math.min(arr.length - 1, k);// 最多比较次数不超过数组长度

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count=0;
        int current_value=arr[0];
        while(count<k){
            if(less(arr[0],arr[1])){
                exch(arr,0,1);
                move(arr,1);

            }
            else
                move(arr,1);

            if(current_value==arr[0])
                count++;
            else{
                current_value=arr[0];
                count=1;
            }
            if(current_value==max)
                return current_value;
        }
        return current_value;
    }
*/

    private static void exch(int[] a, int i, int j){
        int t=a[j];
        a[j]=a[i];
        a[i]=t;
    }

    private static boolean less(int a, int b){
        return a<b;

    }


    private static void move(int[] a, int curr){
        for(int i=curr;i<a.length-1;i++){
            exch(a,i,i+1);
        }
    }

    public static void main(String[] args){
        int[] test={2,1,3,5,4,6,7};
        int k=2;
        System.out.println(getWinner(test,k));
    }
}
