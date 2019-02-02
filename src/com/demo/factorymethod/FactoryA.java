package com.demo.factorymethod;

/**
 * 具体工厂A实现类
 */
public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
