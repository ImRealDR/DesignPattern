package com.java.FactorMethod;

public class Test {
	public static void main(String[] args) {
		MobileFactory factory=new NokieFactory();
		Mobile mobile = factory.createMobile();
		mobile.makeCall();
	}
}
