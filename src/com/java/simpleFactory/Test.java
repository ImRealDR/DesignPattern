package com.java.simpleFactory;

public class Test {

	public static void main(String[] args) {
		OperationFactory factory=new OperationFactory();
		CalcOperation operation = factory.CreateOpreation("/", 2, 3);
		System.out.println(operation.doCalc());

	}

}
