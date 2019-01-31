package com.demo.singleton;

/**
 * 双重检查锁模式
 *
 * 优点：两次null检查可以提升并发度。因为synchronized之前检查null可以减少加锁的次数
 * 缺点：复杂。。
 *
 * volatile特征：
 * 1.可见性。一个线程对加了volatile修饰词的变量修改后 ，立刻会把值由工作内存写会主内存。
 * （工作内存属于每个线程。主内存属于各个线程共享）
 * 2.禁止指令重排序优化。（jdk 1.5之后的才有这个功能）
 *
 */
public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking(){
        System.out.println("enter construction func");
    }

    public static DoubleCheckLocking getInstance(){
        if(doubleCheckLocking == null){
            synchronized (DoubleCheckLocking.class){
                if(doubleCheckLocking == null){
                    doubleCheckLocking = new DoubleCheckLocking();
                    //new DoubleCheckLocking()不是原子操作。在编译时可能会有指令重排序的优化，所以doubleCheckLocking要加上volatile修饰词
                }
            }
        }
        return doubleCheckLocking;
    }
}
