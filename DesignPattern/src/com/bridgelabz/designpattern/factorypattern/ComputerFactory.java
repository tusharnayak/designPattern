package com.bridgelabz.designpattern.factorypattern;
public class ComputerFactory {
	public static Computer createComputer(ComputerType type,String hdd,String ram,String cpu) {
		Computer comp=null;
		
		switch (type) {
		case PC:
			comp=new PC(hdd,ram,cpu);
			break;
			
		case Server:
			comp=new Server(hdd,ram,cpu);
			break;
			
		case SuperComputer:
			comp=new SuperComputer(hdd,ram,cpu);
			break;
		
		}
		return comp;
	}
}