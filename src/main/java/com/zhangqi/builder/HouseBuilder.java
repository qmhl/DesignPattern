package com.zhangqi.builder;


// 抽象的建造者
public abstract class HouseBuilder {
	//  将House注入
	protected House house = new House();

	//将建造的流程写好, 抽象的方法
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();

	//建造房子好， 将产品(房子) 返回
	public House buildHouse() {
		return house;
	}

}