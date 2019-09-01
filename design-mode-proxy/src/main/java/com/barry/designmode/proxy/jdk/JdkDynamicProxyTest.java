package com.barry.designmode.proxy.jdk;

import com.barry.designmode.proxy.Singer;
import com.barry.designmode.proxy.ISinger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 由于java封装了newProxyInstance这个方法的实现细节，
 * 所以使用起来才能这么方便，具体的底层原理将会在下一小节说明。
 * 缺点：可以看出静态代理和JDK代理有一个共同的缺点，
 * 就是目标对象必须实现一个或多个接口，加入没有，则可以使用Cglib代理。
 * @author: Tongshan.Han
 * @time: 2019/8/30 14:30
 * https://www.cnblogs.com/boboxing/p/8126046.html
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        Singer target = new Singer();
        ISinger proxy = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK--->向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("JDK--->谢谢发夹");
                        return returnValue;
                    }
                });
        proxy.sing();
    }


}
