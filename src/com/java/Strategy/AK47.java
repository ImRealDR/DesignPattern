package com.java.Strategy;

public class AK47 implements Gun{

	@Override
	public void singleFire() {
		System.out.println("��������һ����׼�����Ա�ͷ");
	}

	@Override
	public void multiFire() {
		System.out.println("������ǰ��ǹ�Ƚ�׼�����ȶ�");
	}

	@Override
	public void aim() {
		System.out.println("ֻ����׼����׼");
	}

}
