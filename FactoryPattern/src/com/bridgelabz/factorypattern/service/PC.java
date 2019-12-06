package com.bridgelabz.factorypattern.service;

public class PC implements Computer{
	private String RAM;
	private String HDD;
	private String CPU;
	public PC(String ram, String hdd, String cpu) {
		
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
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


	@Override
	public String toString() {
		return "PC [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	
	
	

}
