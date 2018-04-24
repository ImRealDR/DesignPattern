package com.java.proxypattern;

public class Test {
	public static void main(String[] args) {
		/*CarProxy carProxy=new CarProxy(new Ford());
		carProxy.productCar();
		carProxy.sell();*/
		
		Ford ford = new Ford();
		ford.productCar();
		ford.sell();
	}
}
