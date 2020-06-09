package com.company;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/high-five/
 * @author: Jacky
 * @create: 2020-06-09 00:28
 **/
public class HighFive {
    public static void highFive() {
        //可以有1000个学生，每门课的分数为1-100
        //每个学视至少有5个以上的汾数。
        //输出中每个学生含有2个数据。ID和平均分数
        //每组数据为学生ID+学生分数
        //容纳一个只要需要前5个最高分的动态数据库

        //JAVA创建固定长度的动态数组
        int[][] items=new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        //所以怎么有效的获取学生数量需要再看题意理解
        int studentNums = items[items.length - 1][0];
        int[][] output=new int[studentNums][2];
        System.out.println(items.length+" and "+studentNums);
        //return output;
    }
    public static void main(String []args)
    {
        highFive();
    }
}
