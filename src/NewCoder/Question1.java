package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: ok
 * @author: Jacky
 * @create: 2020-07-12 19:47
 **/
public class Question1
{
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int a=Integer.parseInt(line);
        //System.out.println(a);
        String[] number1=input.readLine().split("\\s+");
        String[] number2=input.readLine().split("\\s+");
        int[][] mem=new int[a][2];
        for(int i=0;i<a;i++){
            mem[i][0]=Integer.parseInt(number1[i]);
            mem[i][1]=Integer.parseInt(number2[i]);

        }

        //System.out.println(Arrays.toString(number1));
        //System.out.println(Arrays.toString(number2));

        Arrays.sort(mem, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o2[1]-o1[1];
                return o2[0]-o1[0];
            }
        });
        for(int i=0;i<a;i++){
            System.out.print((mem[i][0]));
            System.out.print(' ');
            System.out.print(mem[i][1]);
            System.out.println();

        }
        //System.out.println(Arrays.toString(mem[0]));


    }
}
