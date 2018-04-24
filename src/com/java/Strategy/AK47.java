package com.java.Strategy;

public class AK47 implements Gun{

	@Override
	public void singleFire() {
		System.out.println("单发，第一发很准，可以爆头");
	}

	@Override
	public void multiFire() {
		System.out.println("连发，前三枪比较准，不稳定");
	}

	@Override
	public void aim() {
		System.out.println("只能用准心瞄准");
	}

}
