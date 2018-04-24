package com.java.AbstractFactoryPattern;

public class Test {
	public static void main(String[] args) {
		Factory factory = new FactoryA();
		Product pa = factory.createProductA();
		NewProduct pb = factory.createProductB();
		pa.productInfo();
		pb.productSay();
		
		Factory factory1 = new FactoryB();
		Product pa1 = factory1.createProductA();
		NewProduct pb1 = factory1.createProductB();
		pa1.productInfo();
		pb1.productSay();
		
	}
}
