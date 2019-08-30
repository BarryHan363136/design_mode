package com.barry.designmode.strategy.demo1;

/**
 * @description: 策略类都对外暴露
 * @author: Tongshan.Han
 * @time: 2019/8/30 17:58
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }


}
