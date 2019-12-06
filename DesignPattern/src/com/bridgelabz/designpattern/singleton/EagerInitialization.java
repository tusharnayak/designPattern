package com.bridgelabz.designpattern.singleton;

public class EagerInitialization {
	private EagerInitialization() {//constructor should be private to avoid client to use the application
		
	}
	private static EagerInitialization instance=new EagerInitialization();
	public EagerInitialization getInstance() {
		return instance;
	}
		
	private static EagerInitialization instance1=new EagerInitialization();
	public EagerInitialization getInstance1() {
		return instance1;
		
	}
		
	
	public static void main(String[] args) {
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
	}
	

}
