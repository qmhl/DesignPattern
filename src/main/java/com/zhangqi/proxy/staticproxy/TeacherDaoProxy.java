package com.zhangqi.proxy.staticproxy;

/**
 *   代理类
 */
public class TeacherDaoProxy implements  ITeacherDao {

    private ITeacherDao targer; //  目标对象 通过接口聚合进来

    //  构造器  带参构造 进行初始化
    public TeacherDaoProxy(ITeacherDao targer) {
        this.targer = targer;
    }

    public void teach() {
        System.out.println("代理老师");
        targer.teach();
        System.out.println("代理……提交");

    }
}
