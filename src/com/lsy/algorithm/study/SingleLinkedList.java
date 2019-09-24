package com.lsy.algorithm.study;

public class SingleLinkedList {
    private int size;//链表的节点个数
    private Node head;//链表的头节点
    //无参构造
    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    //链表的每个节点类
    private class Node{
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接

        public Node(Object data){
            this.data = data;
        }

    }
    //在链表头添加元素
    public Object addHead(Object obj){
        Node newHead = new Node(obj);
        if (size==0){
            head = newHead;
        }else {
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }
    //在链表头删除元素
    public Object deleteHead(){
        Object obj = head.data;
        head = head.next;
        size--;
        return obj;
    }
    //查找指定元素，找到了返回节点Node，找不到返回null
    public Node find(Object obj){
        Node current = head;
        int tmpSize = size;
        while (tmpSize>0){
            if (obj.equals(current)){
                return current;
            }else {
                current = current.next;
            }
            tmpSize--;

        }
        return null;
    }
    //删除指定元素，删除成功返回true
    public boolean delete(Object obj){
        if (size==0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while (current.data!=obj){
            if (current.next==null){
                return false;
            }else {
                previous = current;
                current = current.next;
            }
        }
        //如果删除的是第一个节点
        if (current==head){
            head = current.next;
            size--;
        }else {//删除的不是第一个节点
            previous.next = current.next;
            size--;

        }
        return true;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return (size==0);
    }
    //显示当前节点信息
    public void display(){
        if (size>0){
            Node node = head;
            int tempSize = size;
            if (tempSize==1){//当前链表一个节点
                System.out.println("["+node.data+"]");
                return;

            }
            while (tempSize>0){
                if (node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if (node.next==null){
                    System.out.print(node.data+"]");
                }else {
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else {//如果链表一个节点都没有打印[]
            System.out.println("[]");

        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.delete("C");
        singleList.display();
        //查找B
        System.out.println(singleList.find("B"));
    }
}
