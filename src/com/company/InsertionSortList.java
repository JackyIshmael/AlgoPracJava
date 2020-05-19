package com.company;

import java.util.*;
import java.lang.*;

/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/insertion-sort-list/
 * @author: Jacky
 * @create: 2020-05-16 06:29
 **/
public class InsertionSortList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, OddEvenLinkedList.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;

        ListNode SortTail=head;

        ListNode TestNode=head.next;

        ListNode temp=head;

        while(TestNode!=null && TestNode.next!=null){
            temp=SortTail;

            while(temp)

        }

    }    //插入排序。
    //就是每次 去和已经排序好的一段序列去比对，如果小就替换

}
