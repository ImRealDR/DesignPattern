package com.java.simpleFactory;

public class MinusOperation extends DefaultOperation implements CalcOperation {
	
	public MinusOperation(float a,float b) {
		this.setA(a);
		this.setB(b);
	}
	
	
	@Override
	public float doCalc() {
		return this.getA()-this.getB();
	}

}
