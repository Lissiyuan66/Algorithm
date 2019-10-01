package com.lsy.algorithm.study;

public class SelectionSort {
    public static int[] sort (int [] a){
        for (int i=0;i<a.length;i++){
            //用来储存最小数的索引
            int index = i;
            //每次将最小的数保存在最前面
            for (int j=i;j<a.length;j++){
                if (a[j]<a[index]){
                    //储存最小数的索引
                    index = j;
                }
            }
            //交换最小数和循环最前面的数
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
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
