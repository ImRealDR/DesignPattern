package com.java.FactorMethod;

public class NokieFactory implements MobileFactory {

	@Override
	public Mobile createMobile() {
		return new N83();
	}

}
