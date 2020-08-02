package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 走楼梯
 * @author: Jacky
 * @create: 2020-07-15 10:35
 **/
public class SHOPEEQ1 {

    public static int test(int stages){
        // 定义 base状态
        if(stages<=0)
            return 0;

        if(stages==1)
            return 1;

        if(stages==2)
            return 2;

        return test(stages-1)+test(stages-2);
        //return Math.max((stages-1),(stages-2))+1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int nums=Integer.parseInt(line);
        int ways=test(nums);

        System.out.println(ways);


    }
}
