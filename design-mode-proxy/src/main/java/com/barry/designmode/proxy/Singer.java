package com.barry.designmode.proxy;

import com.barry.designmode.proxy.jingtai.ISinger;

public class Singer implements ISinger {

    /**
     * 目标对象实现了某一接口
     * */
    @Override
    public void sing() {
        System.out.println("唱一首歌");
    }

}
