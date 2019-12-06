package com.bridgelabz.designpattern.facadepattern;

import java.sql.Connection;

public class MySqlHelper {
	public static Connection getMySqlDBConnectopn() { //here we are getting dbconnection
		return null;
	}
	public Connection generateMySqlPDFReport(String tableName,Connection con) {//generating sql pdf report from the table
		return con;
	}
	public Connection generateMySqlHTMLReport(String tableName,Connection con) {
		return con;//generating html report from the table
		
	}

}
