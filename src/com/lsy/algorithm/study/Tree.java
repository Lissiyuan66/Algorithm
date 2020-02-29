package com.lsy.algorithm.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private static Node root;

    /**
     * 层次遍历
     */
    public static ArrayList<Node> levelOredr(Node root) {
        if (root == null) {
            return null;
        }
        ArrayList<Node> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
            list.add(node);
        }
        return list;
    }

    public static void main(String[] args) {
        /**
         * 树的结构
         *              1
         *       2             3
         *         4         5  6
         *                 7
         */
         Node node7 = new Node(7);
         Node node6 = new Node(6);
         Node node5 = new Node(5, node7, null);
         Node node4 = new Node(4);
         Node node3 = new Node(3, node5, node6);
         Node node2 = new Node(2, null, node4);
         root = new Node(1, node2, node3);
         ArrayList<Node> allNodes = levelOredr(root);
         for (int i = 0; i < allNodes.size(); i++) {
         System.out.print(allNodes.get(i).getData() + "    ");
         }
         }
         }
