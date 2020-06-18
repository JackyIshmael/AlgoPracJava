package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/H
 * @author: Jacky
 * @create: 2020-06-18 01:11
 **/

//排序用JAVA自身的collection库就可以完成

public class StringSortA {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int a=Integer.parseInt(line);

        while((line=input.readLine())!=null){
            //用trim来删除头尾的空白符
            if(line.trim().length()==0) return;
            String[] temp=line.split("\\s+");
            List<String> list=Arrays.asList(temp);
            //直接用java中的排序来处理
            Collections.sort(list);
            System.out.println(String.join(" ",list));
        }


    }
}
