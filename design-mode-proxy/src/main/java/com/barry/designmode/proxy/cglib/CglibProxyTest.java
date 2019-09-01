package com.barry.designmode.proxy.cglib;

import com.barry.designmode.proxy.Singer;

public class CglibProxyTest {

    public static void main(String[] args) {
        //目标对象
        Singer target = new Singer();
        //代理对象
        Singer proxy = (Singer) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy.sing();
    }


}
