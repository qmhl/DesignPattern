package com.zhangqi.prototype.deepclone1;

public class Person  implements Cloneable {
    private int age;
    private String name;
    private Address address;

    public Person() {
    }

    public Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //  重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person)super.clone();
        //手动对address属性进行clone，并赋值给新的person对象
        person.address = (Address) address.clone();
        return person;
    }


    public String display() {
        return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
    }
}
