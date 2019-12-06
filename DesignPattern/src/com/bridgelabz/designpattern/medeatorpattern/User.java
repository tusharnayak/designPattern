package com.bridgelabz.designpattern.medeatorpattern;
public abstract class User {
	protected ChatMedeator mediator;
	protected String name;
	
	public User(ChatMedeator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);

}
