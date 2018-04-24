package com.java.simpleFactory;

public class DvdOperation extends DefaultOperation implements CalcOperation {

	public DvdOperation(float a,float b) {
		this.setA(a);
		this.setB(b);
	}

	@Override
	public float doCalc() {
		if(this.getB()==0)
			return 0;
		return this.getA()/this.getB();
	}

}
