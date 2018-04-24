package com.java.simpleFactory;

public class AddOperation extends DefaultOperation implements CalcOperation{
	
	public AddOperation(float a,float b){
		this.setA(a);
		this.setB(b);
	}
	
	@Override
	public float doCalc() {
		return this.getA()+this.getB();
	}

}
