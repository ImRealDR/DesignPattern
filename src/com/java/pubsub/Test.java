package com.java.pubsub;

import java.util.Observable;

public class Test {
	public static void main(String[] args) {
		Player player=new Player("����");
		player.setGame("CS:GO");
		
		Viewer1 viewer1=new Viewer1();
		viewer1.subscribe("����");
		
		player.play();
		
	}
}
