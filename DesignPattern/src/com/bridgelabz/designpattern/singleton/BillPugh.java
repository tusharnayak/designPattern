package com.bridgelabz.designpattern.singleton;

public class BillPugh {
	private BillPugh() {
		
	}
	private static class SingletonHelper{
		private static BillPugh instance=new BillPugh();
	}
		public static BillPugh getInstance() {
			return SingletonHelper.instance;
	}
		public static void main(String[] args) {
			System.out.println(BillPugh.getInstance().hashCode());
			//System.out.println(BillPugh.getInstance().hashCode());
		}
}
