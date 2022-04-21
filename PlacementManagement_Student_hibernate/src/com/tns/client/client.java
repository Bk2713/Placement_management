package com.tns.client;


import com.tns.entity.Certificate;
import com.tns.entity.Student;

import com.tns.service.IStudentService;
import com.tns.service.IStudentServiceImpl;

public class client {

	public static void main(String[] args) {
		
		//creating an object of all entity files
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
		
		
		       
		         student.setName("Dhoni");
		         student.setRoll(49);
		         student.setQualification("MS");
		         student.setCourse("EC");
		         student.setYear(2023);
		         student.setHallTicketNo(111);
		         student.setCollege("Ranchi University");
		         
		         

		 		Certificate certificate = new Certificate();
		 		
		 		certificate.setYear(2019);
		 		certificate.setCollege("mumbai");
		 		
		 		//one to one
		 		student.setCertificate(certificate);
		 		certificate.setStudent(student);
		 		
		 		service.addStudent(student);
		 		System.out.println("One student entry and one certificate entry is completed");
		 	
	
	}

}
