package com.java.Strategy;

public class AWP implements Gun{

	@Override
	public void singleFire() {
		System.out.println("�����޴󣬲���׼���Ѵ�׼");
	}

	@Override
	public void multiFire() {
		System.out.println("��������");
	}

	@Override
	public void aim() {
		System.out.println("����׼����׼");
	}

}
