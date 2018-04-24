package com.java.pubsub;

import java.util.HashMap;
import java.util.Map;

public class PlayerManage {
	
	private Map<String,Player> playerMap = new <String,Player>HashMap();
	
	public void register(Player player){
		playerMap.put(player.getName(), player);
	}
	
	public Player get(String playerName){
		return playerMap.get(playerName);
	}
	
	public void remove(Player player){
		playerMap.remove(player.getName());
	}
	
	private PlayerManage(){}
	
	public static PlayerManage getInstance(){
		return PlayerManageInstance.manage;
	}
	
	private static class PlayerManageInstance{
		private static PlayerManage manage=new PlayerManage();
	}
}
