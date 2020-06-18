package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/C
 * @author: Jacky
 * @create: 2020-06-18 00:03
 * 链接：https://ac.nowcoder.com/acm/contest/5646/C
 * 来源：牛客网
 *
 * 输入描述:
 * 输入第一行包括一个数据组数t(1 <= t <= 100)
 * 接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)
 * 输出描述:
 * 输出a+b的结果
 **/
public class ABSUM3 {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=input.readLine())!=null){
            String[] words=line.split("\\s+");
            if(Integer.parseInt(words[0])==0&&Integer.parseInt(words[1])==0){
                input.close();
                return;
            }
            System.out.println(Integer.parseInt(words[0]) + Integer.parseInt(words[1]));
        }

    }
}
