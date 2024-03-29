package com.bridgelabz.factorypattern.factory;

import com.bridgelabz.factorypattern.service.Computer;
import com.bridgelabz.factorypattern.service.PC;
import com.bridgelabz.factorypattern.service.Server;
import com.bridgelabz.factorypattern.service.SuperComputer;

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
