package com.java.proxypattern;

public class Ford implements CarFactory{
	
	@Override
	public void productCar() {
		System.out.println("����--��������");
	}

	@Override
	public void sell() {
		System.out.println("����--��������");
	}
	
}
