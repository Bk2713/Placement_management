package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entity.Student;

public class IStudentRepositoryImpl implements IStudentRepository{

	EntityManager entitymanager;
	//Started life cycles
	
	public IStudentRepositoryImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		entitymanager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entitymanager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = entitymanager.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = entitymanager.find(Student.class, hallTicketNo);
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		entitymanager.remove(student);
		return student;
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public void deleteStudent(int id) {
		Student student = entitymanager.find(Student.class, id);
		entitymanager.remove(student);
		
		
	}

	
		
	

}
