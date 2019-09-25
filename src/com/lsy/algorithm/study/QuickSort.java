package com.lsy.algorithm.study;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        // 包左不包右
        quickSort(arr, 0, arr.length);
    }

    private static void quickSort(int[] arr, int low, int high) {
        // 只有一个元素的话，则什么都不做。
        if (high - low <= 1)    return;

        // 分区。
        int partition = partition(arr, low, high);

        // 递归左右两个分区。
        quickSort(arr, low, partition);
        quickSort(arr, partition + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];   // 基准值是第一个元素。
        int left = low; // 左指针指向最左侧。
        int right = high - 1;   // 右指针指向最右侧。

        while (left < right) {
            // 若右指针大于基准值，则左移。
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right]; // 直到arr[right]小于基准值，放到左边。

            // 若左指针小于基准值，则右移。
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left]; // 直到arr[left]大于基准值，放到右边。
        }

        // 基准值放到正确位置。
        arr[left] = pivot;

        // 把每一趟排序的结果也输出一下。
        print(arr);

        // 返回基准值的索引。
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.print("排序前:  ");
        print(arr);

        quickSort(arr);

        System.out.print("排序后:  ");
        print(arr);
    }

    // 打印数组
    public static void print(int[] arr) {
        if (arr == null)    return;

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
排序前:  6 9 1 4 5 8 7 0 2 3
3 2 1 4 5 0 6 7 8 9
0 2 1 3 5 4 6 7 8 9
0 2 1 3 5 4 6 7 8 9
0 1 2 3 5 4 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
排序后:  0 1 2 3 4 5 6 7 8 9
*/
