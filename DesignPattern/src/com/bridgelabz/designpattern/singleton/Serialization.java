package com.bridgelabz.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	@SuppressWarnings("unused")
	private static Serialization instance;
	private Serialization() {
		
	}
	private static class Helper{
		
		private static final Serialization instance = new Serialization();
	}
	
	
	public static Serialization getInstance() {
		return Helper.instance;
	}


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Serialization s2 = getInstance();
		System.out.println(s2.hashCode());
		
		System.out.println(getInstance().hashCode());
		
		//Serialization
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.ser"));
		oos.writeObject(s2);
		
		//Deserialization
		
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp.ser"));
		Serialization s3 = (Serialization) ois.readObject();
		
		System.out.println(s3.hashCode());
		
		ObjectOutputStream ooos = new ObjectOutputStream(new FileOutputStream("temp.ser"));
		
		ooos.writeObject(s3);
		
		ObjectInputStream oois = new ObjectInputStream(new FileInputStream("temp.ser"));
		Serialization s4 = (Serialization) oois.readObject();
		System.out.println(s4.hashCode());
	}

}
