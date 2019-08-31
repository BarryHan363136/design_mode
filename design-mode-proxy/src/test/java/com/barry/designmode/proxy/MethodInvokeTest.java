package com.barry.designmode.proxy;

import java.lang.reflect.Method;

public class MethodInvokeTest {

    public static void main(String[] args) throws Exception {
        /** 方式一 */
        Method method1 = new Person().getClass().getMethod("test1", String.class);
        Method method2 = new Person().getClass().getMethod("test2", String.class);
        String resp1 = (String) method1.invoke(new Person(), "好好好");
        String resp2 = (String) method2.invoke(new Person(), "喵喵喵");
        System.out.println("=======>"+resp1);
        System.out.println("=======>"+resp2);

        /** 方式二 */
        Person target = new Person();
        Method[] methods = target.getClass().getDeclaredMethods();
        for (Method method : methods){
            String resp = (String) method.invoke(target, "跑跑跑");
            System.out.println("=======>"+resp);
        }
    }

}
