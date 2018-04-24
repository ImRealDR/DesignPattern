package com.java.singleton;
/**
 * ÀÁººµ¥ÀýÄ£Ê½
 * @author Dingr
 *
 */
public class Sigleton2 {
	private volatile static Sigleton2 sigleton2;
	private Sigleton2(){}
	
	public static Sigleton2 getInstance(){
		if(sigleton2==null){
			synchronized (Sigleton2.class) {
				if(sigleton2==null){
					sigleton2 = new Sigleton2();
				}
			}
		}
		return sigleton2;
	} 
	
	public void getHashcode(){
		System.out.println(this.hashCode());
	} 
}
