package com.lsy.algorithm.study;

/**
 * 冒泡排序复习
 */
public class bubbleSort {
    public static int[] sort (int [] a){
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j+1]<a[j]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = {1,5,4,3,6,4};
        sort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
