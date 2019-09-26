package com.lsy.algorithm.study;

/**
 * 链表中倒数第K个节点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class ListReciprocalK {
    public ListNode FindKthToTail(ListNode head,int k) {
        //如果k<=0,或者head==ull返回null
        if (k<=0||head==null){
            return null;
        }
        //定义两个的节点
        ListNode low = head;
        ListNode high = head;
        //走在前面的先走k-1步
        for (int i=0;i<k-1;i++){
            if (high.next!=null) {
                high = high.next;
            }else {
                return null;
            }
        }
        //两个节点一起走到头，前面节点即为目的地
        while (high.next!=null){
            high = high.next;
            low = low.next;
        }
        return low;
    }
}
