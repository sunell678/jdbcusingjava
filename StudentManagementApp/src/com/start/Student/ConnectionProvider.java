package com.start.Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection conn;
public static Connection createC() {
	try {
		//Class.forName("Con.mysql.jdbc.driver");
//create the connection
		String user = "root";
		String password = "pass@word1";
		String url = "jdbc:mysql://localhost:3306/studentmanagement";
		conn=DriverManager.getConnection(url,user,password);
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	return conn;
}
}
