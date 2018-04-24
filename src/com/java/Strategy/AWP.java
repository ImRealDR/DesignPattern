package com.java.Strategy;

public class AWP implements Gun{

	@Override
	public void singleFire() {
		System.out.println("威力巨大，不瞄准很难打准");
	}

	@Override
	public void multiFire() {
		System.out.println("不能连发");
	}

	@Override
	public void aim() {
		System.out.println("用瞄准镜瞄准");
	}

}
