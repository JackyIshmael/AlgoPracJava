package DailyPrac;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/odd-even-linked-list/
 * @author: Jacky
 * @create: 2020-05-16 04:14
 **/


import javax.naming.LinkLoopException;
import java.util.*;
import java.lang.*;
public class OddEvenLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    static ListNode test(ListNode head){
        //get the list into two list.
        //One is consist of the nodes with Odd Serial Num.
        //One is consist of the nodes with Even Serial Num.

        //You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
        //被强制要求在原来的节点中进行更改。

        //核心句子。检测Head
        if (head == null) return null;

        ListNode oddptr=head;
        ListNode evenptr=head.next;
        ListNode evenhead=head.next;

        while(oddptr.next!=null && evenptr.next!=null){
            oddptr.next=evenptr.next;
            evenptr.next=oddptr.next.next;

            oddptr=oddptr.next;
            evenptr=evenptr.next;
        }
        oddptr.next=evenhead;

        return head;


    }

}
