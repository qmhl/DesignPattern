package com.zhangqi.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        //目标对象 【代理对象】
        ITeacherDao iTeacherDao = new TeacherDao();

        //代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(iTeacherDao);
        //通过代理对象 来调用目标对象的方法
        proxy.teach();


        //*****************返回结果如下*****************
//        代理老师
//                老师授课中
//        代理……提交
    }
}
