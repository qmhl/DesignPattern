package com.zhangqi.builder;

//产品->Product
public class House {

	private String baise;
	private String wall;
	private String roofed;

	//  通过get set方法进行注入
	public String getBaise() {
		return baise;
	}
	public void setBaise(String baise) {
		this.baise = baise;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoofed() {
		return roofed;
	}
	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

}

