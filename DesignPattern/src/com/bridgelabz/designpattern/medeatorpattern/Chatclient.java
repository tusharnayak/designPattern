package com.bridgelabz.designpattern.medeatorpattern;
public class Chatclient {
	public static void main(String[] args) {
		ChatMedeator mediator = new ChatMedeatorImpl();
		User user1 = new UserImpl(mediator, "Tushar");
		User user2 = new UserImpl(mediator, "shuvam");
		User user3 = new UserImpl(mediator, "tendulkar");
		User user4 = new UserImpl(mediator,"dhoni");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hi All");
	}

}
