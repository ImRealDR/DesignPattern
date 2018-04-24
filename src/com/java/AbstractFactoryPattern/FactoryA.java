package com.java.AbstractFactoryPattern;

public class FactoryA implements Factory {

	@Override
	public Product createProductA() {
		return new ProductB();
	}

	@Override
	public NewProduct createProductB() {
		return new ProductB2();
	}

}
