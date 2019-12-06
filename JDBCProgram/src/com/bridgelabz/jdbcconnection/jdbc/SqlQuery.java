package com.bridgelabz.jdbcconnection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class SqlQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/tushar";
		String userName="root";		
		String password="password";
		Connection con = null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded successfully");
			System.out.println();
		} catch (ClassNotFoundException e) {
		
			System.out.println("driver not loaded ");
		}
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("connection successful");
			System.out.println();
		} catch (SQLException e) {
			System.out.println("connection not established");
			
		}
		try {
			pstmt=con.prepareStatement("insert into student values(?,?)");
			
			Scanner scan=new Scanner(System.in);
				System.out.println("enter the name");
				String name=scan.nextLine();
				//String name=Utility.StringScanner();
				System.out.println("enter the roll number");
				//int rollNumber=Utility.intScanner();
				int rollNumber=scan.nextInt();
				pstmt.setString(1,name );
				pstmt.setInt(2, rollNumber);
				pstmt.executeUpdate();
			System.out.println("value inserted");
		} catch (SQLException e) {
			System.out.println("value not inserted");
			
		}
		
	}

}
