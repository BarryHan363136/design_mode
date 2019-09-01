package com.barry.designmode.proxy.jingtai;

import com.barry.designmode.proxy.ISinger;
import com.barry.designmode.proxy.Singer;

public class ProxyModeTest {

    public static void main(String[] args) {
        //目标对象
        ISinger targer = new Singer();
        //代理对象
        ISinger proxy = new SingerProxy(targer);
        //执行代理方法
        proxy.sing();
    }

}
