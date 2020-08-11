package NewCoder;

import edu.princeton.cs.algs4.In;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: test
 * @author: Jacky
 * @create: 2020-08-08 17:25
 **/
public class Meituan4 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        int len = Integer.parseInt(line);
        String temp1[] = input.readLine().split("\\s+");
        ArrayList<Integer> nums=new ArrayList<>();
        for (int i = 0; i < temp1.length; i++) {
            nums.add(Integer.parseInt(temp1[i]));
        }
        System.out.println(helper(nums));
    }


    public static int helper(List<Integer> array){
        int left=0;
        int right=left+1;
        int len=array.size();
        int dis=0,count=0;
        ArrayList<Integer> loop=new ArrayList<>();
        while(left==len-1){
            while(array.get(left)==array.get(right)||right<len){
                right++;
            }
            dis=right-left;
            int num_add=0;
            while(dis!=1){
                int temp=dis/2;
                count+= (int) temp;
                dis=(int)temp;
                num_add++;
            }
            int rest_num=right-left-count;
            int bigged_num=array.get(left)+num_add;
            if((right-left)%2==0){
                for(int m=0;m<rest_num;m++){
                    loop.add(bigged_num);
                    bigged_num--;
                }
            }
            if((right-left)%2==1){
                for(int m=0;m<rest_num;m++){
                    loop.add(bigged_num);
                    bigged_num-=2;
                }
            }

            left=right;
            right=left+1;
        }

        return count;

    }
}
