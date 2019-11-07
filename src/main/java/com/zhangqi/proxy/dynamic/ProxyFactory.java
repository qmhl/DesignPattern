package com.zhangqi.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *   代理类
 */
public class ProxyFactory  {

    private Object target; //  目标对象

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //  获取代理类实例
    public Object  getInstance(){

//        public static Object newProxyInstance(ClassLoader loader,
//                Class<?>[] interfaces,
//                InvocationHandler h)
//        newProxyInstance，方法有三个参数：
//
//        loader: 用哪个类加载器去加载代理对象
//
//        interfaces:动态代理类需要实现的接口
//
//        h:动态代理方法在执行时，会调用h里面的invoke方法去执行

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK  动态代理开始");
                        //  通过目标对象获取代理对象
                        Object inv = method.invoke(target, args);

                        System.out.println("JDK  动态代理结束");

                        return inv;
                        
                    }
                });
    }
}
