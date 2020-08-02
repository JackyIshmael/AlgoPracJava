package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: tesrt
 * @author: Jacky
 * @create: 2020-07-16 15:35
 **/
public class huaweiQ1 {

    public static void main(String[] args){
        int[] test={3,11,10,15};
        int target=13;
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0; i< test.length;i++){

            int temp= target-test[i];

            if(map.containsKey(temp)){
                ans[0]=map.get(temp);
                ans[1]=i;
            }

            map.put(test[i],i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
