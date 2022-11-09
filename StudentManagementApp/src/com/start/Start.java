package com.start;

import java.io.BufferedReader;
import java.io.IOException;

import com.start.Student.Student;
import com.start.Student.StudentDao;


public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("hello world");
		BufferedReader br= new BufferedReader(new java.io.InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to Delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit the app");
				int choice = Integer.parseInt(br.readLine());
				
	
			if (choice == 1) {
				System.out.println("Enter student id");
				//int id=br.readLine();
				System.out.println("Enter Students fullname:");
				String name=br.readLine();
				System.out.println("Enter student phoneNumber");
				String phone = br.readLine();
				System.out.println("Enter students city");
				String city = br.readLine();
				
				Student student = new Student(name,phone,city);
				System.out.println(student);
				boolean answer=StudentDao.addStudent(student);
				if(answer) {
					System.out.println("Student sucessfully added");
				}else {
					System.out.println("staudent adding is failed");
				}
				
				
			}
			else if (choice == 2) {
				//delete
			}
			else if (choice == 3) {
				//display
			}
			else if (choice == 4) {
				//exit
			}
			else {
				
			}
	
		System.out.println("Thanks for using Students Management System");

	}
}
}
