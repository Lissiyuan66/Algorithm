package com.lsy.algorithm.study;

import com.lsy.algorithm.exercise.排序复习;

public class 二分查找 {
    public static int Search(int [] a,int key,int low,int high){
        //不存在
        if (key<low&&key>high&&low>high){
            return -1;
        }
        //中间值
        int middle = (low+high)/2;
        //要查找的小于中间值
        if (a[middle]>key){
            //说明在左边，递归调用
            return Search(a,key,low,middle-1);
        //要查找的大于中间值
        }else if (a[middle]<key){
            //说明在右边，递归调用
            return Search(a,key,middle+1,high);
        }else {
            //找到返回
            return middle;
        }
    }

    public static void main(String[] args) {
        int [] a = {1,5,4,3,6,4};
        排序复习.Sortkuaisu(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        int i = Search(a,3,0,a.length-1);
        System.out.println(i);
    }
}
