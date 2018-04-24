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
			System.out.println("�յ�����=="+player.getName()+":"+title);
			System.out.println("��ȥ��"+player.getName()+"ֱ��"+player.getGame()+"��Ϸ");
		}
	}

}
