package com.lsy.algorithm.study;

/**
 * 合并两个有序链表
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class ManyToOneList {
    //循环方法解决
    public ListNode Merge1(ListNode list1,ListNode list2) {
        //创建排序好返回的新链表
        ListNode newListNode = new ListNode(0);
        //创建临时节点，用于移动
        ListNode temp = newListNode;
        while (list1!=null&&list2!=null){
            if (list1.val<list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1==null){
            temp.next = list2;
        }
        if (list2==null){
            temp.next = list1;
        }
        newListNode = newListNode.next;
        return newListNode;
    }
    //递归方法解决
    public ListNode Merge2(ListNode list1,ListNode list2){
        //递归出口
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode newNode;
        //递归
        //如果list1的值小于list2，合并后链表当前节点值为list1，并且list1指向其next
        if (list1.val<list2.val){
            newNode = list1;
            //递归调用传入list1的下一个节点，进行判断
            newNode.next = Merge2(list1.next,list2);

        }else {
            newNode = list2;
            newNode.next = Merge2(list2.next,list2);
        }
        return newNode;
    }
}
