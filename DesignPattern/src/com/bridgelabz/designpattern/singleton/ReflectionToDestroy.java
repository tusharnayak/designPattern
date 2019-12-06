package com.bridgelabz.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class ReflectionToDestroy {
	private static ReflectionToDestroy instance=null;

	// prevent the Reflection 
	
	
	private ReflectionToDestroy() {
		if(instance!=null) {
			throw new RuntimeException("Can not create use get Instance");
		}
	}
	private static class Helper{
		private static final ReflectionToDestroy instance  = new ReflectionToDestroy();
	}
	
		public static ReflectionToDestroy getInstance() {
			return Helper.instance;
		}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ReflectionToDestroy s1 = getInstance();
		System.out.println(s1.hashCode());
		
		//Load the class 
		Class clazz =	Class.forName("com.bridgelabz.designPatterns.Singleton.ReflectionToDestroy");
		//Get Declared Constructor
		Constructor<ReflectionToDestroy> ctor = clazz.getDeclaredConstructor();
		//change the permission of the constructor using encapsulation
		ctor.setAccessible(true);
		//Create a new Instance;		
		ReflectionToDestroy s4 = ctor.newInstance();
		System.out.println(s4.hashCode());
		

	}
	

}
