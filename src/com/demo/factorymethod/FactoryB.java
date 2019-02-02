package com.demo.factorymethod;

/**
 * 具体工厂B实现类
 */
public class FactoryB extends Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
