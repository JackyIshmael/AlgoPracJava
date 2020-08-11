package NewCoder;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: test
 * @author: Jacky
 * @create: 2020-08-08 16:39
 **/
public class Meituan1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = input.readLine().split("\\s+");
        int[] input_num=new int[5];
        int sum=0;
        int customer=0;

        for(int i=0;i<5;i++){
            input_num[i]=Integer.parseInt(temp[i]);
            sum+=input_num[i]*(i+1);
            customer+=input_num[i];
        }
        double average=Double.valueOf(sum)/Double.valueOf(customer);
        DecimalFormat df = new DecimalFormat(".0");// 保留五位小数非四舍五入型
        String str = df.format(average);
        BigDecimal test=new BigDecimal(average);
        BigDecimal helper=new BigDecimal(1);
        test=test.divide(helper,1,BigDecimal.ROUND_DOWN);
        System.out.println(test);
    }
}
