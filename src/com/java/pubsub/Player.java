package com.java.pubsub;

import java.util.Observable;

public class Player extends Observable{
	
	public Player(String name){
		this.name = name;
		PlayerManage.getInstance().register(this);
	}
	
	public void play(){
		String title = "开播了，先"+this.game+"再吃鸡";
		this.setChanged();
		this.notifyObservers(title);
	}
	
	private String name;
	private String game;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
	
	
}
