package com.barry.designmode.strategy.demo1;

/**
 * @description: 执行减法动作
 * @author: Tongshan.Han
 * @time: 2019/8/30 17:56
 */
public class OperationSubstract implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
