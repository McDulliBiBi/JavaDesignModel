package com.demo.singleton;

/**
 * 静态内部类写法
 *
 * 优点：
 * 1.延时加载
 * 2.由于静态内部类只会内加载一次，所以线程安全
 *
 */
public class StaticInnerClass {
    private static class Holder{
        private static StaticInnerClass staticInnerClass1 = new StaticInnerClass();
    }

    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return Holder.staticInnerClass1;
    }
}
