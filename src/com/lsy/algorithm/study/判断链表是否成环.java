package com.lsy.algorithm.study;

public class 判断链表是否成环 {
    public static boolean has(ListNode list){
        ListNode high = list;
        ListNode low = list;
        while (high!=null&&high.next!=null){
            high = high.next.next;
            low = low.next;
            if (high==low){
                return true;
            }
        }
        return false;
    }
}
