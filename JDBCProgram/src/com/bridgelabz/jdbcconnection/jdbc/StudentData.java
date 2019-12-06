package com.bridgelabz.jdbcconnection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/tushar";
		String userName="root";
		String password="password";
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, userName, password);
        
		Statement stmt =con .createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
	}
	

}
}
