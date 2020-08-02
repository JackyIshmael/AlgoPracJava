package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 括号分析 20题
 * @author: Jacky
 * @create: 2020-07-10 10:01
 **/
public class ValidParth {


    public static boolean Matchtest(String testcase){

        HashMap<Character,Character> test=new HashMap<Character, Character>();
        test.put(')','(');
        test.put('}','{');
        test.put(']','[');

        Stack<Character> stack=new Stack<Character>();
        char top='a';
        for(int i=0;i<testcase.length();++i){
            char c=testcase.charAt(i);
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(c==')'||c=='}'||c==']'){

                if(!stack.empty())
                    top=stack.pop();

                if(top!=test.get(c))
                    return false;
            }


        }
        return stack.empty();
    }


    public static void testCase(){
        String testcase="()[]{}";
        System.out.println( Matchtest(testcase));   
        String testcase1="(]";
        System.out.println( Matchtest(testcase1));
        String testcase2="([)]";
        System.out.println( Matchtest(testcase2));
        String testcase3="{[]}";
        System.out.println( Matchtest(testcase3));
    }


    public static void main(String[] args)
    {
        testCase();
       // Matchtest(testcase);
    }


}
