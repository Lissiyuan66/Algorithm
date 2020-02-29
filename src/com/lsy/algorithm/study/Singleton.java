package com.lsy.algorithm.study;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    private static class Inner{
        private static final Singleton sing = new Singleton();
    }
    public static Singleton getSing(){
        return Inner.sing;
    }
}
