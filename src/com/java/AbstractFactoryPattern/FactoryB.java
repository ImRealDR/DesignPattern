package com.java.AbstractFactoryPattern;

public class FactoryB implements Factory {

	@Override
	public Product createProductA() {

		return new ProductA();
	}

	@Override
	public NewProduct createProductB() {
		return new ProductA2();
	}

}
