package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//code to fetch the data from student table  - from clg_db
		
		
		Connection con = null;
		try {
			
			// Load the Driver ....optional
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creat the connection
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clg_db","root","Bhushan@7797");
			
			// Creating statement
			Statement stmt =con.createStatement();
			
			// step 4 : Execute query
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name :"+rs.getString(2));
				System.out.println("Subject :"+rs.getString(3));
				System.out.println("rollno :"+rs.getInt(4));
				
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("Unable to load the Driver because driver class not found!!");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Some exception occured while connecting to the DB!!");
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				System.out.println("Connection close successfully!!!");
			} catch(SQLException e) {
				System.out.println("Error while closing the connection!!");
				e.printStackTrace();
			}
		}

	}
	
}	
