package com.zhangqi.proxy.dynamic;

/**
 * 目标类
 */
public class TeacherDao  implements ITeacherDao {

    //实现接口的方法
    public void teach() {
        System.out.println("老师授课中");
    }

    public void syaHello(String  name) {
        System.out.println(name+"老师  sayHello");

    }
}
