package com.start.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
public static boolean addStudent(Student student) {
	boolean status=false;
	try {
		Connection conn=ConnectionProvider.createC();
		String query = "insert into students(phone,sname,scity)values(?,?,?)";
		PreparedStatement pt=conn.prepareStatement(query);
		pt.setString(1, student.getStudentPhone());
		pt.setString(2, student.getStudentName());
		pt.setString(3, student.getStudentCity());
		pt.executeUpdate();
		status=true;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return status;
}
}
