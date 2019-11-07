package com.zhangqi.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        //目标对象 【代理对象】
        ITeacherDao iTeacherDao = new TeacherDao();

        //代理对象
        ProxyFactory proxy = new ProxyFactory(iTeacherDao);
        ITeacherDao proxyInstance = (ITeacherDao) proxy.getInstance();

        // 通过代理对象调用方法
        proxyInstance.syaHello("ftom");
        proxyInstance.teach();

        //*****************返回结果如下*****************
//        JDK  动态代理开始
//        ftom老师  sayHello
//        JDK  动态代理结束

//        JDK  动态代理开始
//        老师授课中
//        JDK  动态代理结束
    }
}
