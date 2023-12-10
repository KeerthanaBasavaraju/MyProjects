package com.destination.jdbcPrograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/test1";
			String user="root";
			String pwd="Myself@987654321";
			Connection con=DriverManager.getConnection(url,user,pwd);
			Scanner sc= new Scanner(System.in);
			String sql="Update Student set name=? where id=?";
			PreparedStatement pst= con.prepareStatement(sql);
			System.out.println("Enter the name to be changed:");
			pst.setString(1, sc.next());
			System.out.println("Enter the student id:");
			pst.setInt(2, sc.nextInt());
			int x =pst.executeUpdate();
			if(x>0)
			{
				System.out.println("Updated");
			}
			else
			{
				System.out.println("Update failed");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

			