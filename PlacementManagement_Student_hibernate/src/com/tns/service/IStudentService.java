package com.tns.service;

import com.tns.entity.Student;

public interface IStudentService 
	{
	
	public Student addStudent(Student student);  // C
	
	public Student updateStudent(Student student);  // U
	
	public Student searchStudentById(int id);  // R

	public Student searchStudentByHallTicket(int hallTicketNo); // R

	
	
	public Student deleteStudent(Student student); // D
	
	
	}


