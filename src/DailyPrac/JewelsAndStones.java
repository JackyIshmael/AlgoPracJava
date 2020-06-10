package DailyPrac;

import java.awt.desktop.SystemEventListener;

public class JewelsAndStones {
    public static boolean binaryCheck(char key, int low, int high, String J)
    {

        //System.out.println(key);

        int mid=0;

        if(low>high)
        {
            return false;
        }

        while(low<=high){
            System.out.println(key);
            System.out.println(low);
            System.out.println(high);

            mid=low+(high-low)/2;
            System.out.println(mid);
            System.out.println(J.charAt(mid));

            //int cmp=key.compareTo(J.charAt(mid));
            if(key<J.charAt(mid)){
                System.out.println("Hello");
                high=mid-1;
            }
            else if(key>J.charAt(mid))
            {
                System.out.println("Hello");
                low=mid+1;
            }
            else
                return true;
        }
        return false;
    }

    public static int numJewelsInStones(String J, String S) {
        int count=0;
        int low=0;
        int high=J.length()-1;
        for(int i=0;i<S.length();i++){
            if(J.indexOf(S.charAt(i))!=-1)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        String J="aA";
        String S="aAAbbbbb";

        System.out.println(numJewelsInStones(J,S));
    }
}
