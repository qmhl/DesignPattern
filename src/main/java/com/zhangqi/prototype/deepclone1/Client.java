package com.zhangqi.prototype.deepclone1;


public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {

	// 深拷贝测试

		Person person = new Person(15, "zhangsan", new Address("四川", "天府二街"));
		//  通过clone（）  获取新的拷贝对象
		Person clonePerson = (Person) person.clone();

		System.out.println(person);
		System.out.println(clonePerson);

		//com.zhangqi.prototype.shallowclone.Person@4554617c
		//com.zhangqi.prototype.shallowclone.Person@74a14482
		//  说明了原对象与新对象是两个不同的对象。

		System.out.println(person.display());
		System.out.println(clonePerson.display());

		//Person [age=15, name=zhangsan, address=Address [province=四川, street=天府二街]]
		//Person [age=15, name=zhangsan, address=Address [province=四川, street=天府二街]]
		//拷贝出来的新对象与原对象内容一致

		//  对新克隆的对象重新进行赋值
		clonePerson.setName("wangwu");
		clonePerson.setAge(20);
		Address address = clonePerson.getAddress();
		System.out.println("获取到的address内容是"+address.toString());

		address.setStreet("天府四街");
		System.out.println(clonePerson.display());
		System.out.println(person.display());
//		获取到的address内容是Address [province=四川, street=天府二街]
//		Person [age=20, name=wangwu, address=Address [province=四川, street=天府四街]]
//		Person [age=15, name=zhangsan, address=Address [province=四川, street=天府二街]]

//		原person对象的address内容未受到影响
//
//		因此，修改clonePerson里面的address内容时，原person里面的address内容会跟着改变。

	}

}
