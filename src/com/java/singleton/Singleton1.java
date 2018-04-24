package com.java.singleton;
/**
 * ¶öººµ¥ÀýÄ£Ê½
 * @author Dingr
 *
 */
public class Singleton1 {
	private static Singleton1 singleton1=new Singleton1();
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return singleton1;
	}
	
	public void getHashcode(){
		System.out.println(this.hashCode());
	} 
}
