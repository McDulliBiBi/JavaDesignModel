package com.demo.factorymethod;

/**
 * 客户端
 *
 * 工厂方法模式
 */
public class Client {
    public static void main(String []args){
        //生产Product A
        Factory factoryA = new FactoryA();
        Product p1 = factoryA.createProduct();
        p1.show();

        //生产Product B
        FactoryB factoryB = new FactoryB();
        Product p2 = factoryB.createProduct();
        p2.show();

    }

}
