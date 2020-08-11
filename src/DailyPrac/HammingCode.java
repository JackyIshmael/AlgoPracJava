package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: Test
 * @author: Jacky
 * @create: 2020-08-07 09:53
 **/
public class HammingCode {
    public static void main(String[] agrs){
        String str="00000000000000000000000000001011";
        String str1="00000000000000000000010000000000";
        String str2="11110001111000000111100000001011";

        System.out.println(hamming(str));
        System.out.println(hamming(str1));
        System.out.println(hamming(str2));


    }

    public static int hamming(String nums){
        Map<Character,Integer> count=new HashMap<>();

        for(char c: nums.toCharArray()){
            if(c=='1'){
                if(count.containsKey(c))
                    count.put(c,count.get(c)+1);
                else
                    count.put(c,1);
            }

        }

        return count.get('1');
    }
}
