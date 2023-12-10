package com.destination.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentModel 
{
	String sname;
	String usn;
	int m1;
	int m2;
	int m3;
	private Connection connection;
	private PreparedStatement prepareStatement;
	private ResultSet resultSet;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public StudentModel() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccodes",
					"root","Myself@987654321");
			System.out.println("Connection established");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	public boolean fetchResult() {
		try
		{
			String sql = "select * from result where usn = ?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, usn);
			System.out.println(usn);
			resultSet = prepareStatement.executeQuery();
			while(resultSet.next()==true)
			{
				sname=resultSet.getString("sname");
				//usn=resultSet.getString("usn");
				m1=resultSet.getInt("m1");
				m2=resultSet.getInt("m2");
				m3=resultSet.getInt("m3");
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

}