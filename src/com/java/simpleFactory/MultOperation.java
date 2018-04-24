package com.java.simpleFactory;

public class MultOperation extends DefaultOperation implements CalcOperation {

	public MultOperation(float a,float b) {
		this.setA(a);
		this.setB(b);
	}

	@Override
	public float doCalc() {
		return this.getA()*this.getB();
	}

}
