package com.java.Strategy;

public class Buy {
	private Gun gun;
	public Buy(Gun gun){
		this.gun = gun;
	}
	
	public void singleShoot(){
		gun.aim();
		gun.singleFire();
		gun.multiFire();
	}
	
	
}
