package com.myx.demo;


interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理开始");
        factory.produceCloth();
        System.out.println("代理结束");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("生产耐克");
    }
}
public class StaticProxy {
    public static void main(String[] args) {
        //创建被代理类
        NikeClothFactory nike = new NikeClothFactory();
        //创建代理类
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
