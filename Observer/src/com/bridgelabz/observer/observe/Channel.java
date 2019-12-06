package com.bridgelabz.observer.observe;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private List<Subscriber>subs=new ArrayList<>();
	private String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscriber() {
		for (Subscriber subscriber : subs) {
			subscriber.update();
			
		}
	}
	public void update(String title) {
		this.title=title;
		notifySubscriber();
	}
	

}
