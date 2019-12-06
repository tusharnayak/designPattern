package com.bridgelabz.observer.observe;

public class Subscriber {
	private String name;
	private Channel channel=new Channel();
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update() {
		System.out.println("hey "+name+" video upload");
	}
	public void subscribeChannel(Channel ch) {
		channel=ch;
		
	}
}
