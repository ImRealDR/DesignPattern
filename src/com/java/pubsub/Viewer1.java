package com.java.pubsub;

import java.util.Observable;
import java.util.Observer;

public class Viewer1 implements Observer{
	
	public void subscribe(String playerName){
		Player player = PlayerManage.getInstance().get(playerName);
		if(player!=null){
			player.addObserver(this);
		}
	}
	
	public void unsubscribe(String playerName){
		Player player = PlayerManage.getInstance().get(playerName);
		if(player!=null){
			player.deleteObserver(this);
		}
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		String title = (String) arg;
		if(o instanceof Player){
			Player player = (Player) o;
			System.out.println("收到推送=="+player.getName()+":"+title);
			System.out.println("我去看"+player.getName()+"直播"+player.getGame()+"游戏");
		}
	}

}
