package DailyPrac;
import java.util.*;

/**
 * #: 403
 * https://leetcode.com/problems/remove-k-digits/
 *
 */
public class RemoveFixedCharacter {
    public static String removeKdigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<Character>();

        for(char digit : num.toCharArray()) {
            while(stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
                stack.removeLast();
                k -= 1;
            }
            stack.addLast(digit);
        }

        //remove the remaining digits from the tail.
        for(int i=0; i<k; ++i) {
            stack.removeLast();
        }

        // build the final string, while removing the leading zeros.
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: stack) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        // return the final string
        if (ret.length() == 0) return "";
        return ret.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String test =in.nextLine();
        int k=in.nextInt();
        System.out.println(removeKdigits(test,k));
        //String test1=in.nextLine();


    }

}
