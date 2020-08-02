package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 联发科
 * @author: Jacky
 * @create: 2020-07-24 20:01
 **/
public class IsPrime {

    public static void main(String[] args) throws  IOException{

        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int num=Integer.parseInt(line);

        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(long i=2;i*i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
