package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * @author: Jacky
 * @create: 2020-07-01 00:57
 **/
public class RemoveDuplicatesfromSortedListII
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null||head.next==null)
                return head;

            ListNode dummy=new ListNode(-1);
            dummy.next=head;
            ListNode a=dummy;
            ListNode b=head.next;
            while(b!=null){

                if(a.next.val!=b.val){
                    a=a.next;
                    b=b.next;
                }
                else{
                    while(b!=null&& a.next.val==b.val){
                        b=b.next;
                    }
                    a.next=b;
                    b= b==null? null:b.next;
                }

            }
            return dummy.next;

        }
    }

}
