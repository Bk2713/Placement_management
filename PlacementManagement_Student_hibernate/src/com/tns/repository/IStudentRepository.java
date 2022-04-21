package com.tns.repository;

import com.tns.entity.Student;

public interface IStudentRepository {

		public Student addStudent(Student student);
		public Student updateStudent(Student student);
		public Student searchStudentById(int id);
		public Student searchStudentByHallTicket(int HallticketNo);
		public Student deleteStudent(Student student);
		
		public abstract void beginTransaction();
		public abstract void commitTransaction();
		
		void deleteStudent(int id);
	}


