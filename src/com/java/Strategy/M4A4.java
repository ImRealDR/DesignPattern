package com.java.Strategy;

public class M4A4 implements Gun{

	@Override
	public void singleFire() {
		System.out.println("������ǰ��ǹ�Ƚ�׼���Ƚ��ȶ�");
	}

	@Override
	public void multiFire() {
		System.out.println("���������ܱ�ͷ");
	}

	@Override
	public void aim() {
		System.out.println("ֻ����׼����׼");
	}

}
