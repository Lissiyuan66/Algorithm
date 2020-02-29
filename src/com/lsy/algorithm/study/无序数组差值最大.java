package com.lsy.algorithm.study;

public class 无序数组差值最大 {
    public static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (max<arr[j]-arr[i]&&i<j){
                    max = arr[j]-arr[i];
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int [] a = {1,2,3,77,566,43,5};
        System.out.println(max(a));
    }
}
