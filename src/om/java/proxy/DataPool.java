package om.java.proxy;

import java.util.LinkedList;

public class DataPool {
	private static LinkedList<Connect> connectpool =new LinkedList<>();
	
	private	DataPool(){//��ʼ�� ����10������
		for(int i=0;i<=10;i++){
			connectpool.add(ConnectFactory.CreateNewConnect());
		}
	}
   
	public static DataPool getInstance(){//��ȡ�������ӳ�ʵ�� 
		return DataPoolInstance.dataPool;
	}
   
	public Connect getConnect(){
		return connectpool.removeFirst();
	}
	
	public void closeConnect(){}
	
	public Connect createNewConnect(){
		return ConnectFactory.CreateNewConnect();
	}
	
	public void recovreyConnect(Connect connect){
		connectpool.add(connect);
	}
	
	private static class DataPoolInstance{
		static DataPool dataPool=new DataPool();
	}
}
