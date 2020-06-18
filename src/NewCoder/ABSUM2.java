package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/B
 * @author: Jacky
 * @create: 2020-06-17 15:38
 **/
public class ABSUM2 {
    public static void main(String[] args) throws IOException{

        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line;
        line=input.readLine();
        int a=Integer.parseInt(line);
        System.out.println("记录了行数："+a);
        while((line=input.readLine())!=null){
            String[] words=line.split("\\s+");
            System.out.println(Integer.parseInt(words[0]) + Integer.parseInt(words[1]));
        }
    }
}

