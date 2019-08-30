package com.barry.designmode.builder;

/**
 * @description: entity class
 * @author: Tongshan.Han
 * @time: 2019/8/30 14:30
 * https://blog.csdn.net/zxd1435513775/article/details/83016670
 * https://www.jianshu.com/p/afe090b2e19c
 */
public class Computer {

    /** 公共参数 */
    private final String cpu;
    private final String memory;
    private final String hardDisk;
    /** 可选参数 */
    private String mouse;
    private String keyboard;
    private String monitor;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.hardDisk = builder.hardDisk;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
        this.monitor = builder.monitor;
    }

    public static class Builder {
        private final String cpu;
        private final String memory;
        private final String hardDisk;
        private String mouse;
        private String keyboard;
        private String monitor;

        public Builder(String cpu, String memory, String hardDisk){
            this.cpu = cpu;
            this.memory = memory;
            this.hardDisk = hardDisk;
        }

        public Builder mouse(String mouse){
            this.mouse = mouse;
            return this;
        }

        public Builder keyboard(String keyboard){
            this.keyboard = keyboard;
            return this;
        }

        public Builder monitor(String monitor){
            this.monitor = monitor;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }

}
