package com.prowings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc1 {

	public static void main(String[] args) {

		try {
			// 1. Load the .....driver optional
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.Creat connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clg_db", "root", "Bhushan@7797");

			// 3.Creat Statement
			PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id = ");
			int id = sc.nextInt();
			ps.setInt(1, id);

			System.out.println("enter name = ");
			String name = sc.next();
			ps.setString(2, name);

			System.out.println("enter subject = ");
			String subject = sc.next();
			ps.setString(3, subject);
			
			System.out.println("enter rollno = ");
			int rollno = sc.nextInt();
			ps.setInt(4, rollno);

			// 4. Execute query
			int res = ps.executeUpdate();

			if (res > 0) {
				System.out.println("row is inserted");
			} else {
				System.out.println("row is not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
