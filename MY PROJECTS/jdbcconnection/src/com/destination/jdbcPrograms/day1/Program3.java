package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/test1";
			String user="root";
			String pwd="Myself@987654321";
			Connection con=DriverManager.getConnection(url,user,pwd);
			java.sql.Statement stmt= con.createStatement();
			int x=stmt.executeUpdate("create table student (id int,name varchar(60))");
			if (x>=0) {
				System.out.println("Table Created");
			}
			else {
				System.out.println("Table creation failed");
			}
			stmt.close();
			con.close();
			sc.close();
		}
		catch(Exception e){
			System.out.println("Exception Caught");
		}
	}

}