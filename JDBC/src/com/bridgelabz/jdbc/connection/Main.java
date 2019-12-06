package com.bridgelabz.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/tushar";
		String userName = "root";
		String password = "password";
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet res = null;
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
		System.out.println("1.add the student details");
		System.out.println("2.delete the student details");
		System.out.println("3.getting all the data from table");
		System.out.println("4.update name");
		System.out.println("5.drop table");

		int choice = Utility.intScanner();

		switch (choice) {
		case 1:
			pstmt = con.prepareStatement("insert into student1 values(?,?)");
			System.out.println("enter the name");
			String name = Utility.StringScanner1();
			System.out.println("enter the roll number");
			int rollNumber = Utility.intScanner();
			pstmt.setString(1, name);
			pstmt.setInt(2, rollNumber);
			pstmt.executeUpdate();
			System.out.println("value inserted");
			break;

		case 2:
			pstmt = con.prepareStatement("delete from student1 where id = ?");
			System.out.println("enter the roll number you want to delete");
			int roll = Utility.intScanner();
			pstmt.setInt(1, roll);
			pstmt.executeUpdate();
			System.out.println("roll number deleted successfully");
			break;

		case 3:
			 stmt = con.createStatement();
			 res = stmt.executeQuery("select * from student1");
			 while (res.next() == true) {
		        String studentName = res.getString(1);
				int id = res.getInt(2);
				System.out.println("name=" + studentName + " id=" + id);
			 }
			 break;
			 
		case 4:
			pstmt=con.prepareStatement("update student1 set name=? where name=?");
			System.out.println("enter the new name you want to update");
			String updateName=Utility.StringScanner1();
			System.out.println("enter the old name ");
			String oldName=Utility.StringScanner1();
			pstmt.setString(1, updateName);
			pstmt.setString(2, oldName);
			pstmt.executeUpdate();
			System.out.println("name update successfully");
			break;
		case 5:
//			pstmt=con.prepareStatement("drop table ?");
//			System.out.println("enter the table name");
//			String tableDelete=Utility.StringScanner();
//			pstmt.executeUpdate();
//			System.out.println("table deleted");
			stmt=con.createStatement();
			String sql="drop table ssss";
			stmt.executeUpdate(sql);
			System.out.println("table deleted ");
			}
	}
}