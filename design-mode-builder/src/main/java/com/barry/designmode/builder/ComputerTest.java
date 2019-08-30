package com.barry.designmode.builder;

/**
 * @description:
 * @author: Tongshan.Han
 * @time: 2019/8/30 15:32
 */
public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = new Computer
                .Builder("1核", "4G", "500G")
                .mouse("爱国者鼠标")
                .keyboard("爱国者键盘")
                .monitor("爱国者显示器")
                .build();
        System.out.println("=========>"+computer.toString());
    }

}