package NewCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @program: JavaTest
 * @description: 123
 * @author: Jacky
 * @create: 2020-08-08 11:14
 **/
public class Netease3 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        int groups = Integer.parseInt(line);
        for(int i=0;i<groups;i++);
        {
            int nums=Integer.parseInt(input.readLine());
            String temp1[] = input.readLine().split("\\s+");
            int[] array_temp=new int[nums];
            int max=0;
            for(int j=0;j<nums;j++){
                array_temp[j]=Integer.parseInt(temp1[j]);
                if(max<array_temp[j])
                    max=array_temp[j];
            }
            System.out.println(helper(array_temp,max,nums));
            //System.out.println(Arrays.toString(array_temp));
        }
    }


    public static int helper(int[] array,int max,int N){
        int rest=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){

        }
        return 0;
    }
}