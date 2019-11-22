package com.lsy.algorithm.study;

import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("true");
        }else if (a<0){
            System.out.println("false");
        } else {
            System.out.println("false");
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        LinkedList linkedList = new LinkedList();
        char temp = 'a';
        for (int i = 0; i < b1.length; i++) {
            temp = b1[i];
            linkedList.add(temp);
        }
        temp = (char) linkedList.poll();
        for (int i = 0; i < a1.length; i++) {

            if (a1[i] == temp) {
                if (linkedList.peek()!=null) {
                    temp = (char) linkedList.poll();
                }else {
                    System.out.println("yes");
                    System.exit(0);
                }
            }

        }
        System.out.println("no");
    }
}
