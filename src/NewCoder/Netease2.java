package NewCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

/**
 * @program: JavaTest
 * @description: 123
 * @author: Jacky
 * @create: 2020-08-08 11:14
 **/
public class Netease2 {
    static int mid=0;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp1[] = input.readLine().split("\\s+");
        int n=Integer.parseInt(temp1[0]);
        int m= Integer.parseInt(temp1[1]);
        String temp2[]= input.readLine().split("\\s+");
        int[] nums=new int[m];
        Set<Integer> test=new HashSet<>();
        for(int i=0;i<m;i++){
            nums[i]= Integer.parseInt(temp2[i]);
            test.add(nums[i]);
        }

        List<Integer> res= helper(nums,n,m,test);
        if(mid==1)
            res.add(nums[m-1]);
        int counter=0;
        for(int i:res){
            counter++;
            System.out.print(i);
            if(counter<n)
                System.out.print(' ');
        }
        //System.out.println(Arrays.toString(nums));
    }

    public static List<Integer> helper(int[] nums, int n,int m, Set test){
        List<Integer> result=new ArrayList<>();
        int Target=n-m;
        int max=0;
        for(int i=0;i<m-1;i++){
            if(max<nums[i])
                max=nums[i];
            if(i==0){
                for(int j=1;j<nums[i];j++){
                    if(!test.contains(j)){
                        Target--;
                        result.add(j);
                        test.add(j);
                        if(Target==0){
                            mid=1;
                            return result;
                        }

                    }
                }
                result.add(nums[i]);
            }
            if(nums[i+1]-nums[i]>1){
                if(i>0){
                    result.add(nums[i]);
                }

                for(int j=nums[i]+1;j<nums[i+1];j++){
                    if(!test.contains(j)){
                        Target--;
                        result.add(j);
                        test.add(j);
                        if(Target==0){
                            mid=1;
                            return result;
                        }

                    }
                }
            }
            else if (nums[i]-nums[i+1]>1){
                if(i>0){
                    result.add(nums[i]);
                }
                for(int j=nums[i+1]+1;j<nums[i];j++){
                    if(!test.contains(j)){
                        Target--;
                        if(Target==0){
                            mid=1;
                            return result;
                        }
                        result.add(j);
                        test.add(j);
                    }
                }
            }
            if(i==m-2)
                result.add(nums[m-1]);
        }
        int temp=max+1;
        while(Target>0){
            result.add(temp);
            temp++;
            Target--;
        }
        return result;
    }
}