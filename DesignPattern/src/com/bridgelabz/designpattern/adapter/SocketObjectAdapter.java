package com.bridgelabz.designpattern.adapter;
public class SocketObjectAdapter implements SocketAdapter{
	//Using Composition for adapter pattern
		private Socket sock = new Socket();
		
		@Override
		public Volt get120Volt() {
			return sock.getVolts();
		}

		@Override
		public Volt get12Volt() {
			Volt v= sock.getVolts();
			return convertVolt(v,10);
		}

		@Override
		public Volt get3Volt() {
			Volt v= sock.getVolts();
			return convertVolt(v,40);
		}
		
		private Volt convertVolt(Volt v, int i) {
			return new Volt(v.getVolts()/i);
		}
	

}
