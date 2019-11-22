package com.lsy.algorithm.exercise;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        if (a < 0) {
            Integer q = a * -1;
            String b = q.toString();
            StringBuffer c = new StringBuffer(b);
            c.reverse();
            int cq = Integer.parseInt(String.valueOf(c));
            System.out.println(cq * -1);
        } else {
            String b = a.toString();
            StringBuffer c = new StringBuffer(b);
            c.reverse();
            int cq = Integer.parseInt(String.valueOf(c));
            System.out.println(cq);
        }
    }

}
