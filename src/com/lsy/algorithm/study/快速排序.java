package com.lsy.algorithm.study;

public class 快速排序 {
    public static void Sort(int [] arr,int low,int high){
        if (arr.length<=0){
            return;
        }
        if (low>=high){
            return;
        }
        int left = low;
        int right = high;
        //保存基准值
        int temp = arr[left];
        while (left<right) {
            //从后往前找到比基准值小的数，填入基准位置
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            //从前往后找到大于基准数，填入右边指向的位置
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        //将基准值填入中间位置，分治递归
        arr[left] = temp;
        Sort(arr,low,left-1);
        Sort(arr,left+1,high);


        }

    public static void main(String[] args) {
        int [] a = {1,6,4,8,55566,678};
        Sort(a,0,a.length-1);
        for (int i:a) {
            System.out.println(i);
        }
    }
}
