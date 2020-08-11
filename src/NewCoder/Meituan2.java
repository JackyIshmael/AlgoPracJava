package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: test
 * @author: Jacky
 * @create: 2020-08-08 16:51
 **/
public class Meituan2 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        int groups = Integer.parseInt(line);
        int count=0;
        int pay=0;
        int worth=0;
        while((line=input.readLine())!=null&&count<groups){
            String[] temp=line.split("\\s+");
            int x=Integer.parseInt(temp[0]);
            int y=Integer.parseInt(temp[1]);
            if(x<=y){
                worth+=y;
            }
            if(x>y){
                worth+=x;
                pay+=(x-y);
            }
            count++;
        }
        System.out.print(worth);
        System.out.print(' ');
        System.out.print(pay);

    }
}
