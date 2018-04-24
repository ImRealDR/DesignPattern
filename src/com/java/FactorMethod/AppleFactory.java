package com.java.FactorMethod;

public class AppleFactory implements MobileFactory {

	@Override
	public Mobile createMobile() {
		return new Iphone();
	}

}
