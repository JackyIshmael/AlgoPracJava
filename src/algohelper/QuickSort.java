package algohelper;

import edu.princeton.cs.algs4.StdRandom;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: Test
 * @author: Jacky
 * @create: 2020-07-15 21:21
 **/
public class QuickSort {

    //基础算法：
    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    //定义一个必须的比较函数
    //两个必须是可以比较的变量==》拆包
    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }
    //其实就是对a,b做一个封装以便于理解。 如果 a比b小，就直接返回false而不是-1；

    private static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    private static void show(Comparable[] a){
        //在单行中打印数组
        for(int i=0;i<a.length;++i){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }



    private static void sort(Comparable[] a,int lo, int hi){
        if(hi<=lo) return;


        //然后，按照条件，进行快速排序。
        //首先进行切分，将问题细化为两个小部分，同事保证每一趟切分，都有一个位置j的元素被一定排序完毕。然后对位置j左右两边再进行切分。（一直切下去，就可以保证最终的全排列）
        int j= partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    //切分后，返回所在的位置.
    private static int partition(Comparable[] a, int lo, int hi){
        //在之中将数组切分为 lo到j, j到hi；

        //设定左右指针
        int leftptr=lo,rightptr=hi+1;
        //因为用了lo作为基准指，因此比较时用前缀运算符来避免比较基准值和pivot。
        //为了规范，rightptr也加1来配合前缀运算符。
        //设置一个基准值
        Comparable pivot=a[lo];

        while(true){
            //滑动左指针直到找到 大于等于基准值的值
            //因此 小于基准指就一直滑
            while(less(a[++leftptr],pivot)){
                if(leftptr==hi) break;
            }
            //之后滑动右指针直到找到 小于等于基准值的值
            //因此 大于基准值就一直滑
            while(less(pivot,a[--rightptr])){
                if(rightptr==lo) break;
            }
            if(leftptr>=rightptr) break;
            //那么这两个值相对于pivot，其位置是不合理的，所以需要交换
            exch(a,leftptr,rightptr);
        }
        //循环完毕之后，将基准值位置lo的值与 左右指针选择一个进行交换。
        //因为左半部分肯定是小于pivot的，所以将基准和左半部分的指针交换肯定没问题，这样交换之后不会破坏左右分割的状态; ==> 真的是这样吗？
        //但是根据base状态的分析，当最后左右指针相邻，且各自的元素都没有问题或者说刚进行了一次交换之后。 左指针位置依旧小于右指针
        //进入循环后，++左边指针会指向刚好大于pivot的元素（右指针当前指向的元素），退出内循环，
        //     --右边指针会导致刚好指向小于pivot的元素（相当于之前左指针指向的元素）,退出了内循环。
        //交换了左右指针的内容，导致不正常的左右交换，难以修正。 且此时 左指针大于了右指针（交错）
        //因此 While中的判断条件 不能是leftprt>hi
        //而是要将判断条件移动到，左右指针交错之后。阻止两个原本正常顺序的元素被交换
        //之后，右指针其实指向的是小于等于pivot的元素，因此最后要将 基准位置和右指针进行交换。
        exch(a,lo,rightptr);
        System.out.println(Arrays.toString(a));
        //之后，返回右指针坐标，表示 pivot基准所在的位置已经被排序完毕。
        return rightptr;

    }

    public static void main(String[] args){
        Comparable[] test={2,9,3,6,1,7,2,8,5,8,2,6};
        sort(test);
        System.out.println(Arrays.toString(test));
        LinkedList<Integer> test23=new LinkedList<>();
    }



}
