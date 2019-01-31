package com.demo.singleton;

/**
 * 用枚举实现单线程
 */
public enum EnumSingleton {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
