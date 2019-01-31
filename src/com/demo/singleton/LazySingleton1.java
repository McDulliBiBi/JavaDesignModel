package com.demo.singleton;

/**
 * 懒汉式写法1
 *
 * 优点：懒加载。延时加载。
 * 缺点：线程不安全。如果有两个线程同时调用getInstance()，可能会创建出多个对象
 *
 */
public class LazySingleton1 {
    private static LazySingleton1 lazySingleton1;

    private LazySingleton1(){
        System.out.println("enter construction func");
    }

    public static LazySingleton1 getInstance(){
        if(lazySingleton1 == null){
            lazySingleton1 = new LazySingleton1();
        }
        return lazySingleton1;
    }

    public static void main(String[] args){
        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    LazySingleton1 lazySingleton1 = LazySingleton1.getInstance();
                    System.out.println("thread 1 " + lazySingleton1);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    LazySingleton1 lazySingleton1 = LazySingleton1.getInstance();
                    System.out.println("thread 2 " + lazySingleton1);
                }
            }
        }.start();
    }
}
