package NewCoder;

import java.util.*;
import java.lang.*;

/**
 * 牛客所有输入输出
 * https://ac.nowcoder.com/acm/contest/5646#question
 * @program: JavaTest
 * @description: https://ac.nowcoder.com/acm/contest/5646/A
 * @author: Jacky
 * @create: 2020-06-17 12:24
 **/
public class ABSum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        String line;
        String[] getInt;
        for(int i=0;i<a;i++){
            line=sc.nextLine();
            getInt=line.split(" ");
            System.out.println(Integer.parseInt(getInt[0]) + Integer.valueOf(getInt[1]));
        }
    }
}
