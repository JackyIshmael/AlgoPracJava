package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * @program: JavaTest
 * @description: 123
 * @author: Jacky
 * @create: 2020-08-08 11:14
 **/
public class Netease1 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        int len = Integer.parseInt(line);
        String temp1[] = input.readLine().split("\\s+");
        int[] nums = new int[len];
        int count=0;
        for (int i = 0; i < temp1.length; i++) {
            nums[i] = Integer.parseInt(temp1[i]);
            count+=IsPrime(nums[i]);
        }

        //System.out.println(Arrays.toString(nums));
        System.out.println(count);


        //用
    }


    public static int IsPrime(int input){
        if(input==0 || input ==1) return 0;
        if(input==2) return 1;
        if(input%2==0) return input/2;
        if(input%2==1) return input/2;
        return 0;
    }
}