package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/test1";
			String user="root";
			String pwd="Myself@987654321";
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Established");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the id:");
			String query="Select * from student where id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,sc.nextInt());
			ResultSet rs=pst.executeQuery();
			while (rs.next()!=false)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("----------");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}