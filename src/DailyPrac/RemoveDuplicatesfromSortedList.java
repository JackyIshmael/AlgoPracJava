package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @author: Jacky
 * @create: 2020-07-01 00:55
 **/
public class RemoveDuplicatesfromSortedList {

     public class ListNode {
          int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null)
                return head;
            ListNode current=head;
            while(current!=null && current.next!=null){

                if(current.val==current.next.val)
                    current.next=current.next.next;
                else
                    current=current.next;
            }

            return head;//注意返回头节点而不是链表中的指针。

        }
    }
}
