package com.te.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstDelete {
	 static Connection connection;
	 static Statement statement;

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student_info?user=root&password=lion";
		String query = "delete from info where name = 'john'";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url);
			statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			if (result!=0) {
				System.out.println(result + " no of row affected");
				System.out.println("sucessfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();	
				}
				if (statement!=null) {
					connection.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
