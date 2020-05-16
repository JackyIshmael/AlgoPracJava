package com.company;

public class FirstUniqueCharacterInAString {

    public static void main(String args[]){
        String s="leetcode";

        int []test=new int[26];
        //Cause it only has lowercase characters, so we use an 26 length array to deal with it.

        for(char c:s.toCharArray()){
            test[c-'a']++;
        }

        int count=0;

        for(char c:s.toCharArray()){
            if(test[c-'a']==1){
                count=s.indexOf(c);
                break;
            }

        }
        System.out.println(count);
    }
}
