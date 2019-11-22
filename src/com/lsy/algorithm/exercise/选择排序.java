package com.lsy.algorithm.exercise;

public class 选择排序 {
    public static void Sort(int [] a){
        for (int i=0;i<a.length;i++){
            int index = i;
            for (int j = i;j<a.length;j++){
                if (a[j]<a[index]){
                    index = j;
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
