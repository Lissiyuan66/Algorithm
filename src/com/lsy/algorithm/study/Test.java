package com.lsy.algorithm.study;

import java.util.Stack;

public class Test {
    public static void test(ListNode head) {
        Stack stack = new Stack();
        ListNode low = head;

       while(low!=null){

           stack.push(low.val);
           low = low.next;
    }
       low = head;
       while(!stack.empty()){
           low.val = (int) stack.pop();
           low = low.next;
       }




    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3 = null;
        test(listNode);

        ListNode node = listNode;
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
//        int [] a = {1,4,5,3,5};
//        for (int i=0;i<a.length;i++){
//            listNode.next = a[i];
//
//        }
    }
}
