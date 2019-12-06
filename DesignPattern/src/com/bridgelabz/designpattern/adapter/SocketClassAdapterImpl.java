package com.bridgelabz.designpattern.adapter;
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
	@Override
	public Volt get120Volt() {
		//return get120Volt();
		Volt v=getVolts();
		return convertVolt(v,3);
	}

	@Override
	public Volt get12Volt() {
		Volt v=getVolts();         //dddd
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v=getVolts();
		return convertVolt(v,40);
	}
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}

}
