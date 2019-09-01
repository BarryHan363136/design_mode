package com.barry.designmode.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  Cglib子类代理工厂
 *  在Spring的AOP编程中：
 *  如果加入容器的目标对象有实现接口，用JDK代理
 *  如果目标对象没有实现接口，用Cglib代理
 * */
public class ProxyFactory implements MethodInterceptor {

    //维护目标对象
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调参数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB向观众问好");
        Object returnValue = method.invoke(target, objects);
        System.out.println("CGLIB谢谢大家");
        return returnValue;
    }



}
