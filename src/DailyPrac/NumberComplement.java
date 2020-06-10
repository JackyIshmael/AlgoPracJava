package DailyPrac;

import java.lang.*;
/*
Leetcode
 */
public class NumberComplement {

    public static void DeminalToBinary(int n) {
        int t = 0; // 用来记录位数
        int bin = 0; // 用来记录最后的二进制数
        int r = 0; // 用来存储余数

        while (n != 0) {
            r = n % 2;
            n = n / 2;
            //原作者的方法是：bin += r * Math().pow(10, t),这样写报错，就改成下面这样了，pow（）方法，求取x的y次方，数值类型是double;
            bin += r * Math.pow(10, t);
            t++;
        }
        System.out.println(bin);
    }

    public static void BinaryToDeminal(int n){


    }

    public static void main(String[] args){

        int test_int=1;
        String str_bina_normal=Integer.toBinaryString(test_int);

        String str_bina_reverse=Integer.toBinaryString(~test_int);

        int range=str_bina_reverse.length()-str_bina_normal.length();

        String str=str_bina_reverse.substring(range);

        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: str.toCharArray()) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        int range_2=ret.toString().length();
        //System.out.println(range_2);
        int sum=0;
        for(char digit: ret.toString().toCharArray()){
            sum+=(digit-'0')*Math.pow(2,range_2-1);
            range_2--;
        }


/*        if (ret.length()>0)
            System.out.println(Integer.parseInt(ret.toString()));

        else
            System.out.println(0);*/

        System.out.println(sum);

        //System.out.println();
    }
}