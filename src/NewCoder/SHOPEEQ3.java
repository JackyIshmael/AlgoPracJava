package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 给定一个整数矩阵，找出最长递增路径的长度
 * @author: Jacky
 * @create: 2020-07-15 11:23
 **/
public class SHOPEEQ3 {
    static int[] nums=new int[2];

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        String[] temp=line.split("\\,");
        nums[0]=Integer.parseInt(temp[0]);
        nums[1]=Integer.parseInt(temp[1]);
        int[][] matrix=new int[nums[0]][nums[1]];
        int j=0;
        while((line=input.readLine())!=null && j< nums[0]){
            String[] words=line.split("\\,");
            for(int i=0; i<nums[1];i++){
                //System.out.println("j:"+j+" i:"+i);
                matrix[j][i]=Integer.parseInt(words[i]);
            }

            j++;
        }

        int ans=0;
        for(int m=0;m<nums[0];++m){
            for(int n=0;n<nums[1];++n){

                ans=Math.max(ans,DFS(matrix,m,n));
            }
        }
        //Now we have a Matrix for searching.

        //define the directions of the movement;



        System.out.println(ans);
    }
    //define the directions of the movement;
    static int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    private static int DFS (int[][] matrix, int x, int y){

        int ans=0;

        for(int i=0;i<4;i++){
            int x_move=x+dir[i][0];
            int y_move=y+dir[i][1];

            //insure that the value of next cell is bigger than the one in original position.
            if(x_move>=0 && x_move<nums[0] && y_move>=0 && y_move<nums[1] && matrix[x_move][y_move]>matrix[x][y]){
                ans=Math.max(ans,DFS(matrix,x_move,y_move));
            }
            // stop the recursion;
        }

        return ++ans;
    }
}
