package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: Reverse
 * @author: Jacky
 * @create: 2020-08-02 19:24
 **/
public class Pinduoduo2 {

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String line=input.readLine();
        int num=Integer.parseInt(line);
        int[][] shuai=new int[num][6];
        int count=0;
        while((line=input.readLine())!=null&&count<num){
            String[] temp=line.split("\\s+");
            for(int i=0;i<6;i++){
                shuai[count][i]=Integer.parseInt(temp[i]);
            }
            count++;
        }

        int[] type=new int[num];
        for(int i=0;i<num;i++){
            type[i]=i;
        }
        for(int i=0; i<num;i++){
            Set<Integer> leftSet1 = new HashSet<>();
            Set<Integer> midSet1 = new HashSet<>();
            Set<Integer> rightSet1 = new HashSet<>();
            leftSet1.add(shuai[i][0]);
            leftSet1.add(shuai[i][1]);
            midSet1.add(shuai[i][2]);
            midSet1.add(shuai[i][3]);
            rightSet1.add(shuai[i][4]);
            rightSet1.add(shuai[i][5]);

            for(int j=i+1;j<num;j++){
                Set<Integer> leftSet2 = new HashSet<>();
                Set<Integer> midSet2 = new HashSet<>();
                Set<Integer> rightSet2 = new HashSet<>();
                leftSet2.add(shuai[i][0]);
                leftSet2.add(shuai[i][1]);
                midSet2.add(shuai[i][2]);
                midSet2.add(shuai[i][3]);
                rightSet2.add(shuai[i][4]);
                rightSet2.add(shuai[i][5]);

                if(leftSet1.equals(leftSet2)||leftSet1.equals(rightSet2)||leftSet1.equals(midSet2)){
                    if(midSet1.equals(leftSet2)||midSet1.equals(rightSet2)||midSet1.equals(midSet2)){
                        if(rightSet1.equals(leftSet2)||rightSet1.equals(rightSet2)||rightSet1.equals(midSet2))
                            if(ReverCompare(shuai[i],shuai[j])){
                                type[j]=type[i];
                            }
                            else
                                continue;;
                    }
                }
                else
                    continue;
            }

        }
        int[] counter=new int[num];
        for(int i=0;i<type.length;i++){
            for(int j=i+1;j<type.length;j++){
                if(type[i]==type[j]){
                    counter[i]++;
                }
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < type.length; i++) {
            int value = type[i];
            if (hashMap.containsKey(value)) {
                hashMap.put(value, hashMap.get(value) + 1);
            } else {
                hashMap.put(value, 1);
            }
        }
        System.out.println(hashMap.size());
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
//        System.out.println(Arrays.toString(shuai[0]));
//        System.out.println(Arrays.toString(shuai[1]));


    }

    private static boolean ReverCompare(int[] a,int[] b){
        return true;
    }
    //we have for types of change:
    private static void exch(int[] a, int i, int j){
        int t=a[j];
        a[j]=a[i];
        a[i]=t;
    }

    private static  void UptoDown(int[] a){
        exch(a,0,4);
        exch(a,1,5);
        exch(a,0,1);
    }

    private static void DowntoUp(int[] a){
        exch(a,0,4);
        exch(a,1,5);
        exch(a,4,5);
    }

    private static void RightToLeft(int[] a){
        exch(a,2,4);
        exch(a,3,5);
        exch(a,4,5);
    }

    private static void LeftToRight(int[] a){
        exch(a,2,4);
        exch(a,3,5);
        exch(a,2,3);
    }



}
