package com.demo.simplefactory;

/**
 * 简单工厂模式（静态工厂方法模式）。属于类创建型模式
 * 生产产品的工厂类
 */
public class ProductFactory {

    /**
     * 生产产品的方法。
     * static
     * 根据传入的产品类型，动态生成不同类型的产品
     * @param proType 产品类型
     * @return 具体产品对象
     */
    public static Product createConcreteProduct(String proType){
        Product product = null;
        if("A".equals(proType)){
            product = new ProductA();
            System.out.println("create product A :" + product);
        }else if ("B".equals(proType)){
            product = new ProductB();
            System.out.println("create product B :" + product);
        }else if ("C".equals(proType)){
            product = new ProductC();
            System.out.println("create product C :" + product);
        }else{
            product = null;
            System.out.println("unknown product type");
        }
        return product;
    }
}
