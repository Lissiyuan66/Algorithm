package com.lsy.algorithm.study;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
    int q = 0;
    ArrayList arrayList = new ArrayList();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        while (true){
            shangheng(matrix);
            matrix = shanqianhang(matrix);
            houshu(matrix);
            matrix = shanhoulie(matrix);
            xiaheng(matrix);
            matrix = shanhouhang(matrix);
            shuqian(matrix);
            matrix = shanqianhang(matrix);
            if (arrayList.size()==q){
                break;
            }
        }
        return null;
    }
    public void houshu(int [][] a){
        for (int i=0;i<a.length;i++){
            q++;
            arrayList.add(a[i][a[i].length]);
        }
    }
    public void shangheng(int [][] a){
        for (int i=0;i<a[0].length;i++){
            q++;
            arrayList.add(a[0][i]);
        }
    }
    public void xiaheng(int [][] a){
        for (int i=a[0].length;i>=0;i--){
            q++;
            arrayList.add(a[a.length][i]);
        }
    }
    public void shuqian(int [][] a){
        for (int i=a.length;i>=0;i++){
            q++;
            arrayList.add(a[i][0]);
        }
    }
    public int [][] shanqianhang(int [][] a){
        int [][] b = new int[a.length-1][a[0].length];
        //表示有几行
        for (int i=1;i<a.length;i++){
            //表示有几列
            for (int j=0;j<a[i].length;j++){
                b [i][j] = a [i][j];
            }
        }
        return b;
    }
    public int [][] shanhoulie(int [][] a){
        int [][] b = new int[a.length][a[0].length-1];
        //表示有几行
        for (int i=0;i<a.length;i++){
            //表示有几列
            for (int j=0;j<a[i].length-1;j++){
                b [i][j] = a [i][j];
            }
        }
        return b;
    }
    public int [][] shanhouhang(int [][] a){
        int [][] b = new int[a.length-1][a[0].length];
        //表示有几行
        for (int i=0;i<a.length-1;i++){
            //表示有几列
            for (int j=0;j<a[i].length;j++){
                b [i][j] = a [i][j];
            }
        }
        return b;
    }
    public int [][] shanqianlie(int [][] a){
        int [][] b = new int[a.length][a[0].length-1];
        //表示有几行
        for (int i=0;i<a.length-1;i++){
            //表示有几列
            for (int j=1;j<a[i].length;j++){
                b [i][j] = a [i][j];
            }
        }
        return b;
    }
}
