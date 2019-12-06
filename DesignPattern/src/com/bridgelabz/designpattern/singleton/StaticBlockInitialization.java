package com.bridgelabz.designpattern.singleton;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	private StaticBlockInitialization() {   //constructor
		
	}
	static {
		try {
		instance=new StaticBlockInitialization();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		StaticBlockInitialization instance=new StaticBlockInitialization();
		System.out.println(instance.hashCode());
		
		StaticBlockInitialization instance1=new StaticBlockInitialization();
		System.out.println(instance1.hashCode());
//		
//		StaticBlockInitialization instance2=new StaticBlockInitialization();
//		System.out.println(instance2.hashCode());
//		
//		StaticBlockInitialization instance3=new StaticBlockInitialization();
//		System.out.println(instance3.hashCode());
	}

}
