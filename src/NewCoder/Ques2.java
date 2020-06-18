package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: huawei
 * @author: Jacky
 * @create: 2020-06-18 08:40
 **/
public class Ques2 {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

        String line=input.readLine();
        StringBuilder change=new StringBuilder(line);
        int a=Integer.parseInt(input.readLine());

        //List<String> list=new <String>ArrayList();

        if(line.length()<=a) {
            System.out.println("{"+line+"}");
            return;
        }
        String[] temp=line.split(" ");

        int n=0;
        int i=0;
        for(int m=0;m<temp.length;m++){
            n=temp[m].length();
            i=0;
            while(n>=0){
                if(n<=(a)){
                    System.out.println("{"+temp[m].substring(i,i+n)+"}");
                    break;
                }
                //行尾正好是空格
                if(temp[m].charAt(i+(a-1))==' '){
                    System.out.println("{"+temp[m].substring(i,i+(a-1))+"}");
                    i=i+(a-1)+1;
                    n=n-(a-1)-1;
                    continue;
                }
                //行尾正好是单词的某个字符
                if(temp[m].charAt(i+(a-1)-1)==' ') {
                    System.out.println("{"+temp[m].substring(i,i+(a-1)-1)+"}");
                    i=i+(a-1);
                    n=n-(a-1);
                    continue;
                }
                //该行刚好可以放下整个单词
                if(temp[m].charAt(i+(a-1)+1)==' '){
                    System.out.println("{"+temp[m].substring(i,i+(a))+"}");
                    i=i+(a-1)+2;
                    n=n-(a-1)-2;
                    continue;
                }
                System.out.println("{"+temp[m].substring(i,i+(a-1))+"-"+"}");
                i=i+(a-1);
                n=n-(a-1);
            }
        }





    }

}
