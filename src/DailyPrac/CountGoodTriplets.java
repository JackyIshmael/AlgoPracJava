package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode-cn.com/contest/weekly-contest-200/problems/count-good-triplets/
 * @author: Jacky
 * @create: 2020-08-02 11:52
 **/
public class CountGoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        //设定三个指针，专门用于扩充，
        int len = arr.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(test, a, b, c));
    }
}