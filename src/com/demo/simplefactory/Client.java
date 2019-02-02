package com.demo.simplefactory;

/**
 * 客户端
 */
public class Client {
    public static void main(String [] args){
        Product p1 = ProductFactory.createConcreteProduct("A");
        Product p2 = ProductFactory.createConcreteProduct("B");
        Product p3 = ProductFactory.createConcreteProduct("C");
        Product p4 = ProductFactory.createConcreteProduct("D");
    }
}
