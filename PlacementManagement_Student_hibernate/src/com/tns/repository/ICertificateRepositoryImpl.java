package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entity.Certificate;


public class ICertificateRepositoryImpl implements ICertificateRepository
{
	
	EntityManager entitymanager;
	//Started  JPA Life cycle
	
	public ICertificateRepositoryImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}


	@Override
	public Certificate addCertificate(Certificate certificate) {
		entitymanager.persist(certificate);
		return certificate;
	}


	@Override
	public Certificate updateCertificcate(Certificate certificate) {
		
			entitymanager.merge(certificate);
			return certificate;
	}


	@Override
	public Certificate searchcertificate(int id) {
		Certificate certificate = entitymanager.find(Certificate.class, id);
		return certificate;
	}

	


	@Override
	public Certificate deleteCertificate(Certificate certificate) {
		entitymanager.remove(certificate);
		return certificate;
	}


	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
	}


	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
		
	}

}
