package com.demo.singleton;

/**
 * 饿汉式单例模式
 *
 * 类第一次加载到内存中时就会被初始化
 *
 * 优点：简单
 * 缺点：
 * 1.不是懒加载。即使用户不用这个对象，也会在内存中生成
 * 2.某些场景中不能使用，比如创建这个实例是需要依赖参数或者配置文件的
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("enter construction func");
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public static void main(String[] args){
        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                    System.out.println("thread 1 " + hungrySingleton);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i = 0 ; i<10; i++) {
                    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                    System.out.println("thread 2 " + hungrySingleton);
                }
            }
        }.start();
    }

}
