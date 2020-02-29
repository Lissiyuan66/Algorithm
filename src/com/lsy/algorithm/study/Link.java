package com.lsy.algorithm.study;

public class Link {
    /**
     * 判断链表是否相交
     * @param first
     * @param head
     * @return
     */
    public static boolean isPoint(ListNode first,ListNode head){
        if (first==null||head==null){
            return false;
        }

        while (first!=null){
            first = first.next;
        }
        while (head!=null){
            head = head.next;
        }
        return first==head;
    }
    /**
     * 求出链表长度
     */
    public static int length(ListNode list){
        int count=0;
        while (list!=null){
            list = list.next;
            count++;
        }
        return count;
    }
    /**
     * 求两个链表相交节点
     */
    public static ListNode point(ListNode list1,ListNode list2){
        int len1 = length(list1);
        int len2 = length(list2);
        ListNode longL = list1;
        ListNode shortL = list2;
        int diff = len1-len2;
        if (len2>len1){
            longL = list2;
            shortL = list1;
            diff = len2-len1;
        }
        while (diff--!=0){
            longL = longL.next;
        }
        while (true){
            if (longL==shortL){
                return longL;
            }
            longL = longL.next;
            shortL = shortL.next;
        }
    }

}
