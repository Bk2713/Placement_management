package com.tns.service;

import com.tns.entity.Student;
import com.tns.repository.IStudentRepository;
import com.tns.repository.IStudentRepositoryImpl;

public class IStudentServiceImpl implements IStudentService
{
	IStudentRepository dao;
	

	public IStudentServiceImpl() {
		dao =  new IStudentRepositoryImpl();
	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;

	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;

	}

	@Override
	public Student searchStudentById(int id) {
	    Student student = dao.searchStudentById(id);
	    return student;

	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;

	}

	

	@Override
	public Student deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		return student;
	}


}
