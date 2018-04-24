package com.java.proxypattern;

public class Ford implements CarFactory{
	
	@Override
	public void productCar() {
		System.out.println("福特--生产汽车");
	}

	@Override
	public void sell() {
		System.out.println("福特--销售汽车");
	}
	
}
