package com.lsy.algorithm.study;

public class Bitree {
    int data;
    Bitree lefttree;
    Bitree rightbree;
    Bitree root;
    public Bitree (){
        data = -1;
        lefttree = rightbree = null;
    }
    public Bitree (int d,Bitree left,Bitree right){
        data = d;
        lefttree = left;
        rightbree = right;
    }
    public int getData (){
        return data;
    }
    public void setData (int d){
        data = d;
    }
    public Bitree getLefttree(){
        return lefttree;
    }
    public void setLefttree(Bitree left){
        lefttree = left;
    }
    public Bitree getRightbree(){
        return rightbree;
    }
    public void setRightbree(Bitree right){
        rightbree = right;
    }


}
