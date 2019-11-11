package com.lsy.algorithm.study;

import java.util.Arrays;

public class 归并排序 {


        public static void merge(int[] a,int low,int mid,int high) {
            //创建指针，用于指向起始位置、中间位置、结束位置
            int i,j,k;
            //创建一个和原数组相同的新数组
            int[] b=new int[a.length];
            //将元素复制入新数组中
            for(k=low;k<=high;k++) b[k]=a[k];
            //比较分段数组中元素的大小，并将其排序传入原数组
            for(i=low,j=mid+1,k=i;i<=mid&&j<=high;k++) {
                if(b[i]<=b[j])
                    a[k]=b[i++];
                else
                    a[k]=b[j++];
            }
            //如果有一段中没有元素了，直接将剩下的元素加在其后面
            while(i<=mid) a[k++]=b[i++];
            while(j<=high) a[k++]=b[j++];
        }

        public static void mergeSort(int[] a,int low,int high) {
            //递归终止条件
            if(low<high) {
                //求出数组内元素个数
                int mid=(low+high)/2;
                //分治递归，这里每次传入数组、起始位置、终止位置，并每次缩小范围
                mergeSort(a,low,mid);
                mergeSort(a,mid+1,high);
                //合并两个数组
                merge(a,low,mid,high);
            }
        }

        public static void mergeSort(int[] a) {
            int low=0;
            int high=a.length-1;
            //调用分治递归方法
            mergeSort(a,low,high);
        }

        public static void main(String[] args) {
            int[] a= {12,32,24,99,54,76,48};
            //调用第一个方法，传入数组
            mergeSort(a);
            System.out.println(Arrays.toString(a));
        }

}
