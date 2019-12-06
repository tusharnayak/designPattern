package com.bridgelabz.observerdesign.pattern;

import java.util.Observer;

public interface Subject {
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObserver();
	public Object getUpdate();

}
