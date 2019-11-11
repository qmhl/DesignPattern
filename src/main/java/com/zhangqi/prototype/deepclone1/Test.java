package com.zhangqi.prototype.deepclone1;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        //  两个引用变量的hashcode()值：
        //1163157884
        //1956725890


    }
}
