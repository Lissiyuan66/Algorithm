package com.lsy.algorithm.study;



import java.util.*;

public class 字符串排列 {
    public static ArrayList<String> Permutation(String str) {

        char [] a = str.toCharArray();
        char temp;
        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        if (str.length()==1){
            arrayList.add(str);
            return arrayList;
        }
        for (int j=0;j<str.length();j++) {
            for (int i = 0; i < a.length - 1; i++) {
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                String s = new String(a);
                set.add(s);

            }
        }
         arrayList = new ArrayList<>(set);
        //Collections.sort(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(Permutation(str));
    }


}
