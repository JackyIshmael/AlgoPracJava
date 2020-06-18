package NewCoder;

import java.nio.Buffer;
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/D
 * @author: Jacky
 * @create: 2020-06-18 00:28
 *
 * 输入数据包括多组。
 * 每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
 * 接下来n个正整数,即需要求和的每个正整数。
 * 输出描述:
 * 每组数据输出求和的结果
 *
 * 示例输入
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 * 0
 *
 * 示例输出
 * 10
 * 15
 **/
public class ABSUM4_Array {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line=input.readLine())!=null){
            String[] temp=line.split("\\s+");
            int sum=0;
            if(Integer.parseInt(temp[0])==0) return;
            for(int i=1;i<temp.length;i++){
                sum+=Integer.parseInt(temp[i]);
            }
            System.out.println(sum);
        }
    }
}
