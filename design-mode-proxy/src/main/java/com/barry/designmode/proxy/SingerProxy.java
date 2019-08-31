package com.barry.designmode.proxy;

import com.barry.designmode.proxy.jingtai.ISinger;

public class SingerProxy implements ISinger {

    /** 接收目标对象,以便调用sign方法 */
    private ISinger iSinger;

    public SingerProxy(ISinger iSinger){
        this.iSinger = iSinger;
    }

    /**
     *  代理对象和目标对象实现相同的接口
     * */
    @Override
    public void sing() {
        System.out.println("向观众问好");
        iSinger.sing();
        System.out.println("谢谢大家");
    }



}
