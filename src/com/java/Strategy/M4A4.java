package com.java.Strategy;

public class M4A4 implements Gun{

	@Override
	public void singleFire() {
		System.out.println("连发，前几枪比较准，比较稳定");
	}

	@Override
	public void multiFire() {
		System.out.println("单发，不能爆头");
	}

	@Override
	public void aim() {
		System.out.println("只能用准心瞄准");
	}

}
