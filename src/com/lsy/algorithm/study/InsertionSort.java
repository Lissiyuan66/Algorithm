package com.lsy.algorithm.study;

/**
 * 插入排序
 */
public class InsertionSort {
    public static int [] sort(int [] a){
        for (int i=0;i<a.length-1;i++){
            //第一个数默认已经排序，从第二个数开始
            int current = a[i+1];
            //前一个数的下标
            int index = i;
            //拿当前数和已经排序的数比较，如果比较数据比当前大，就向后挪一步
            while (index>=0&&current<a[index]){
                a[index+1] = a[index];
                index--;
            }
            //while循环跳出说明找到了位置
            a[index+1] = current;
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
