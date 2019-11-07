package com.zhangqi.factory.simplefactory.pizzastore.order;

//�൱��һ���ͻ��ˣ���������
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza();

		//使用简单工厂模式
		new OrderPizza(new SimpleFactory());
		System.out.println("~~退出程序~~");
		
		new OrderPizza2();
	}

}
