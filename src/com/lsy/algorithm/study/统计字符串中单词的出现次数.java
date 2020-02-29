package com.lsy.algorithm.study;

import java.util.HashMap;

public class 统计字符串中单词的出现次数 {
    /**
     * 统计string中单词的出现次数
     */
    public static HashMap findNum(String str){
        String [] arr = {",","!"," ","?"};
        for (int i=0;i<arr.length;i++){
            str = str.replace(arr[i],",");
        }
        String [] newstrarr = str.split(",");

        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i<newstrarr.length;i++){
            String key = newstrarr[i];
            String key1 = key.toLowerCase();
            if (!"".equals(key1)){
                Integer num = map.get(key1);
                if (num==null||num==0){
                    map.put(key1,1);
                }else if (num>0){
                    map.put(key1,num+1);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String text = "Welcome welcome to ADempiere, a commons-based peer-production of Open Source ERP Applications. This Wiki is for the global community to contribute and share know-how and domain expertise. We hope you can find as much open information and participate in making it most usable for everyone. This project has a bazaar of Citizens with a Community Council Team which work in theFunctional Team and Technical Team along the Software Development Procedure supported and funded by the foundation ADempiere";
        System.out.println(findNum(text));
    }
}
