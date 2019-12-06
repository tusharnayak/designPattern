package com.bridgelabz.designpattern.factorypattern;
public class FactoryMain {
	public static void main(String[] args) {
		Computer pc=ComputerFactory.createComputer(ComputerType.PC, "8GB","300GB", "amd");
		Computer server=ComputerFactory.createComputer(ComputerType.Server, "20GB", "1TB","intel");
		Computer superComp=ComputerFactory.createComputer(ComputerType.SuperComputer, "100GB","20TB", "xyz");
		
		System.out.println("factory pc config="+pc);
		System.out.println("factory server config="+server);
		System.out.println("factory super computer config="+superComp);
	}

}
