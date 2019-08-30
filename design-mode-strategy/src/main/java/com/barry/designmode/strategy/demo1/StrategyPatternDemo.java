package com.barry.designmode.strategy.demo1;

/**
 * @description: 策略模式测试类
 * @author: Tongshan.Han
 * @time: 2019/8/30 18:03
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("===OperationAdd=====>"+context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("===OperationSubstract=====>"+context.executeStrategy(10, 5));

        context = new Context(new OperationMultipky());
        System.out.println("===OperationMultipky=====>"+context.executeStrategy(10, 5));

    }


}
