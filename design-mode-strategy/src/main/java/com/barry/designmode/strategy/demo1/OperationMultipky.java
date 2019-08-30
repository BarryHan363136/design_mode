package com.barry.designmode.strategy.demo1;

/**
 * @description: 执行乘法操作
 * @author: Tongshan.Han
 * @time: 2019/8/30 17:58
 */
public class OperationMultipky implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
