package NewCoder;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: huawei
 * @author: Jacky
 * @create: 2020-06-18 08:40
 **/
public class Ques1 {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line=input.readLine())!=null){
            //用trim来删除头尾的空白符
            if(line.trim().length()==0) return;
            String[] temp=line.split(" ");
            List<String> list=new <String>ArrayList();
            for(int i=0;i<temp.length;i++){
                StringBuilder changeY=new StringBuilder();
                for(int j=0;j<(temp[i].toCharArray()).length;j++){
                    char c= temp[i].toCharArray()[j];
                    if(j==0){
                        changeY.append(temp[i].substring(0,1).toUpperCase());
                        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') j++;
                        continue;
                    }
                    if(c=='A'){
                        changeY.append((char)(c+32));
                        j++;
                        continue;
                    }
                    else if(c=='E') {
                        changeY.append((char) (c + 32));
                        j++;
                        continue;
                    }
                    else if(c=='I') {
                        changeY.append((char) (c + 32));
                        j++;
                        continue;
                    }
                    else if(c=='O') {
                        changeY.append((char) (c + 32));
                        j++;
                        continue;
                    }
                    else if(c=='U') {
                        changeY.append((char) (c + 32));
                        j++;
                        continue;
                    }
                    else
                        changeY.append(c);
                }
                //String test=temp[i].substring(0,1).toUpperCase()+temp[i].substring(1);
                list.add(changeY.toString());
            }
            System.out.println(String.join(" ",list));

            //直接用java中的排序来处理
        }


    }

}
