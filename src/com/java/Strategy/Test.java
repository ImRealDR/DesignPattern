package com.java.Strategy;

public class Test {
	public static void main(String[] args) {
		Buy buy=new Buy(new AK47());
		buy.singleShoot();
		buy=new Buy(new M4A4());
		buy.singleShoot();
		
		buy=new Buy(new AWP());
		buy.singleShoot();
		
	}
}
