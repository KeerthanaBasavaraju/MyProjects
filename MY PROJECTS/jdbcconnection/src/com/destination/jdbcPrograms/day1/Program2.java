package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/jdbccodes";
			String user="root";
			String pwd="Myself@987654321";
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("enter the database name: ");
			java.sql.Statement stmt= con.createStatement();
			int x=stmt.executeUpdate("create database "+sc.next());
			if (x>0) {
				System.out.println("Database Created");
			}
			else {
				System.out.println("Database connection failed");
			}
			stmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println("Exception Caught");
		}

	}

}