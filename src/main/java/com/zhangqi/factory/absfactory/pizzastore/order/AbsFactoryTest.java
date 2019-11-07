package com.zhangqi.factory.absfactory.pizzastore.order;

public class AbsFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
