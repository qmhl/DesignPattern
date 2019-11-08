package com.zhangqi.prototype.deepclone1;

/**
 *   这个类相比shallowClone包中的Address中 实现了Cloneable接口 重写clone()方法
 *
 *   要进行深拷贝 需要对引用类型的类实现cloneable接口
 */
public class Address implements Cloneable{

    private String province;
    private String street;

    public Address(String province, String street) {
        this.province = province;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address [province=" + province + ", street=" + street + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
