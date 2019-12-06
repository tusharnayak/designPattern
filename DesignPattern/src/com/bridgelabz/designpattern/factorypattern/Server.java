package com.bridgelabz.designpattern.factorypattern;

public class Server implements Computer{
	private String RAM;
	private String HDD;
	private String CPU;
	public Server(String ram, String hdd, String cpu) {
		
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	
	
	@Override
	public String toString() {
		return "Server [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}


	@Override
	public String getRAM() {
		return this.RAM;
	}
	@Override
	public String getHDD() {
		
return this.HDD;
	}
	@Override
	public String getCPU() {
		return this.CPU;
	}
	

}
