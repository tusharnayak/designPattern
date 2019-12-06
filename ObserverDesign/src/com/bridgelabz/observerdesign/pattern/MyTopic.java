package com.bridgelabz.observerdesign.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MyTopic implements Subject{
	private List<Observer>observer;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	public MyTopic(){
		this.observer=new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observer.contains(obj)) observer.add(obj);
		}
		
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
			observer.remove(obj);
			}
		
	}

	@Override
	public void notifyObserver() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observer);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {///////
			obj.update(o, arg);
			
		}
			
		
	}

//	@Override
//	public Object getUpdate(Observer o) {
//		// TODO Auto-generated method stub
//		return this.message;
//	}
	public void postMessage(String msg){//to post the message
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}

	@Override
	public Object getUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void register(com.bridgelabz.observerdesign.pattern.Observer obj1) {
		// TODO Auto-generated method stub
		
	}
	

}
