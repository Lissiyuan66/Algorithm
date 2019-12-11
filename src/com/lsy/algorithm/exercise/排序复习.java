package com.lsy.algorithm.exercise;

public class 排序复习 {
    //快排
    public static void Sortkuaisu(int[] a, int low, int high) {
        if (a.length <= 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        ///
        int left = low;
        int right = high;
        //保存基准值
        int temp = a[left];
        while (left < right) {
            //从后面找到小于基准值的数，填入基准值
            while (left < right && a[right] >= temp) {
                right--;

            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];

        }
        a[left] = temp;
        Sortkuaisu(a, low, left - 1);
        Sortkuaisu(a, left + 1, high);
    }

    //冒泡
    public static void Sortmaopao(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //选择
    public static void Sortxuanze(int[] a) {
        if (a.length == 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    //插入
    public static void Sortcharu(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int current = a[i + 1];
            int index = i;
            while (index >= 0 && current <= a[index]) {
                a[index + 1] = a[index];
                index--;
            }
            a[index+1] = current;
        }
    }


    public static void main(String[] args) {
        int[] a = {34, 23, 4, 5, 34, 43, 2332, 5, 3};
        //Sortkuaisu(a,0,a.length-1);
        //Sortmaopao(a);
        //Sortxuanze(a);
        Sortcharu(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
