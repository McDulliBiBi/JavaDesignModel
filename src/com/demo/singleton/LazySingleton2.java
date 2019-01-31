package com.demo.singleton;

/**
 * 懒汉式2
 *
 * 优点：线程安全
 * 缺点：效率不高。因为加了类锁，每次只能有一个线程调用getInstance()
 *
 */
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2;

    private LazySingleton2(){
        System.out.println("enter construction func");
    }

    public static LazySingleton2 getInstance(){
        synchronized (LazySingleton2.class){
            if(lazySingleton2 == null){
                lazySingleton2 = new LazySingleton2();
            }
        }
        return lazySingleton2;
    }

    public static void main(String[] args){
        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    LazySingleton2 lazySingleton = LazySingleton2.getInstance();
                    System.out.println("thread 1 " + lazySingleton);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    LazySingleton2 lazySingleton = LazySingleton2.getInstance();
                    System.out.println("thread 2 " + lazySingleton);
                }
            }
        }.start();
    }
}
