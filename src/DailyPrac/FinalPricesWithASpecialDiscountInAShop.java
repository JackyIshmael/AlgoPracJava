package DailyPrac;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: Final Prices With a Special Discount in a Shop
 * @author: Jacky
 * @create: 2020-06-13 22:36
 **/
public class FinalPricesWithASpecialDiscountInAShop {

    public static int[] finalPrices(int[] prices) {

        int[] ans=new int[prices.length];

        for(int i=0;i<prices.length;i++){

            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
        }


        return ans;
    }

    public static void main(String[] args){
        int[] prices={8,4,6,2,3};
        int[] ans=prices;
        ans=finalPrices(prices);
        System.out.println(ans);
    }
}
