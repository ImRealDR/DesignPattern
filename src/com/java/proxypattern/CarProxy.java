package com.java.proxypattern;

public class CarProxy implements CarFactory{
	
	private CarFactory carFactory=null;
	
	public CarProxy(CarFactory carFactory){
		this.carFactory = carFactory;
	}
	
	@Override
	public void productCar() {
		carFactory.productCar();
	}

	@Override
	public void sell() {
		carFactory.sell();
		System.out.println("���������� �Ҹ߼�ת��");
	}

}
