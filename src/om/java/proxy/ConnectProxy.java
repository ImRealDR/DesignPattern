package om.java.proxy;

public class ConnectProxy implements Connect{
	
	private Connect connect;
	
	public ConnectProxy(Connect connect){
		this.connect=connect;
	}
	
	@Override
	public void close() {
		DataPool.getInstance().recovreyConnect(connect);//不真正的关闭
	}
	
}
