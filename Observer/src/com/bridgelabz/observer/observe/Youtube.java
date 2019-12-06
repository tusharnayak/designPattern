package com.bridgelabz.observer.observe;

public class Youtube {
	public static void main(String[] args) {
		Channel bb=new Channel();
		
		Subscriber s1=new Subscriber("tushar");
		Subscriber s2=new Subscriber("uuuu");
		Subscriber s3=new Subscriber("sssss");
		Subscriber s4=new Subscriber("hhhhh");
		Subscriber s5=new Subscriber("aaaa");
		
		
		bb.subscribe(s1);
		bb.subscribe(s2);
		bb.subscribe(s3);
		bb.subscribe(s4);
		bb.subscribe(s5);
		
		s1.subscribeChannel(bb);
		s2.subscribeChannel(bb);
		s3.subscribeChannel(bb);
		s4.subscribeChannel(bb);
		s5.subscribeChannel(bb);
		
		bb.update("uploaded");
		
		
	}

}
