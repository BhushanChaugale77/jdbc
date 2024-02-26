package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StudentRepository {

	public int creatStudent(Student1 s) throws Exception {
		Connection con = null;
		int res = 0;
		 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee/employee-db","root","root");
			java.sql.Statement stmt = con.createStatement();
			int id = s.getId();
			String name = s.getName();
			String subject =s.getSubject();
			int roll = s.getRollno();
			String insertQuery = "insert into student1 values("+id+","+"'"+name+"'"+","+"'"+subject+"'"+","+roll+")";
			res = stmt.executeUpdate(insertQuery);
		 
		
		
		return 0;
		
	}
	
	
	
	
}
