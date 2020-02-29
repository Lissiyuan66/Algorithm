package com.lsy.algorithm.study;

import java.util.HashMap;

public class 数组中x加y等于k {
    public static HashMap somtow(int [] arr, int k){
        HashMap map = new HashMap();
        for (int i=0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == k){
                    map.put(i,j);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int k = 6;
        HashMap map = somtow(a,k);
        System.out.println(map);
    }
}
