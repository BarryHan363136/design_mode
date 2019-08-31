package com.barry.designmode.proxy.jdk;

import com.barry.designmode.proxy.Singer;
import com.barry.designmode.proxy.jingtai.ISinger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        Singer targer = new Singer();
        ISinger proxy = (ISinger) Proxy.newProxyInstance(targer.getClass().getClassLoader(),
                targer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK--->向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(targer, args);
                        System.out.println("JDK--->谢谢发夹");
                        return returnValue;
                    }
                });
        proxy.sing();
    }


}
