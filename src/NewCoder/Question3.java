package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: OK
 * @author: Jacky
 * @create: 2020-07-12 20:10
 **/
public class Question3 {

    public static int Sum(int[]array, int left, int right){

        int sum=0;
        for(int i=left;i<right;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    private static boolean isCubeRoot(long a) {
        int r = (int) Math.round(Math.pow(a, 1.0/3));

        return r * r * r == a;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int a=Integer.parseInt(line);
        String[] temp=input.readLine().split("\\s+");

        int[] num=new int[a];
        for(int i=0;i<a;i++){
            num[i]=Integer.parseInt(temp[i]);
        }

        int left=0,right=0;

        int sum=0;
        int total=0;
        //System.out.println((sum));
        for(int i=1;i<=a; ++i){
            for(int j=0;j<a;j=j+i){
                if(j+i<=a){
                    sum=Sum(num,j,j+i);
                    System.out.println(sum);
                }
                else break;
            }
            if (isCubeRoot(sum)){
                total++;
            }

        }

        //System.out.println(total);
    }
}
