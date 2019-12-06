package com.bridgelabz.designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet internet=new RealInternet();
	private static List<String> restricted;
	static {
		restricted=new ArrayList<String>();
		restricted.add("abc.com");
		restricted.add("xyz.com");
		restricted.add("bridge.com");
		}

	@Override
	public void connectTo(String serverhost) throws Exception {
		if(restricted.contains(serverhost.toLowerCase())) {
			throw new Exception("access denied");
		}
		internet.connectTo(serverhost);
		
		
	}
	
	
}
