package com.bridgelabz.designpattern.singleton;

public class Lazy {
	private static Lazy instance;
	private Lazy() {
		System.out.println("created");
	}
	public static Lazy getInstance() {
		if(instance==null) {
			instance=new Lazy();
		}
		return instance;
	}
	public static void main(String[] args) {
		
		Lazy obj=Lazy.getInstance();
		Lazy obj1=Lazy.getInstance();
		Lazy obj2=Lazy.getInstance();
	}

}
