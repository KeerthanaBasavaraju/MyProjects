package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcCodes";
		String user="root";
		String pwd="Myself@987654321";
		Connection con=DriverManager.getConnection(url,user,pwd);
		if (con!=null) {
			System.out.println("Connection Established");
		}
		else {
			System.out.println("Connection Failed");
		}
	}
}