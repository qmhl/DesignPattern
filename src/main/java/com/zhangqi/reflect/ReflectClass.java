package com.zhangqi.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClass {

    //  参考链接https://www.cnblogs.com/chanshuyi/p/head_first_of_reflection.html

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //直接初始化，「正射」
        Apple apple = new Apple();
        apple.setPrice(4);


        //JDK 提供的反射 API 进行反射调用：

        Class<?> clz = Class.forName("com.zhangqi.reflect.Apple");

        Method setPrice = clz.getMethod("setPrice", int.class);
        //  获取构造函数
        Constructor<?> constructor = clz.getConstructor();
        //  根据构造函数获取实例对象
        Object o = constructor.newInstance();
        //  使用反射调用
        setPrice.invoke(o, 44);

        //  使用反射获取值
        Method getPrice = clz.getMethod("getPrice");
        Object result = getPrice.invoke(o);

        System.out.println(result);   //  44


        //*************通过反射创建类对象*****************

        //第一种：通过 Class 对象的 newInstance() 方法。

        Class appleClass = Apple.class;
        Apple app = (Apple) appleClass.newInstance();


        //  第二种：通过 Constructor 对象的 newInstance() 方法
        Class appleClass2 = Apple.class;
        Constructor constructor2 = appleClass2.getConstructor();
        Apple app2 = (Apple) constructor2.newInstance();



        //*************获取class对象*****************


        // 第一种，使用 Class.forName 静态方法。当你知道该类的全路径名时，你可以使用该方法获取 Class 类对象。
        Class clz1 = Class.forName("java.lang.String");

        // 第二种，使用 .class 方法。
        Class clz2 = String.class;

        // 第三种，使用类对象的 getClass() 方法。
        String str = new String("Hello");
        Class clz3 = str.getClass();


    }
}
