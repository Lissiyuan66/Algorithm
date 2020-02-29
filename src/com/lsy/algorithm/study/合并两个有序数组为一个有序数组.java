package com.lsy.algorithm.study;

public class 合并两个有序数组为一个有序数组 {
    public static int [] towArr(int [] arr1,int [] arr2){
        int a=0;
        int b=0;
        int [] arr = new int[arr1.length+arr2.length];
        for (int i=0;i<arr.length;i++){
            //数组未遍历结束
            if (a<arr1.length&&b<arr2.length){
                if (arr1[a]>arr2[b]){
                    arr[i] = arr1[a];
                    a++;
                }else {
                    arr[i] = arr2[b];
                    b++;
                }
            }else if (a<arr1.length){
                //arr2遍历完，接入arr1到后面
                arr[i] = arr1[a];
                a++;
            }else if (b<arr2.length){
                //arr1遍历完，接入arr2到后面
                arr[i] = arr2[b];
                b++;
            }
        }
        return arr;
    }
}
