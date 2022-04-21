package com.tns.service;


import com.tns.entity.Certificate;

import com.tns.repository.ICertificateRepository;
import com.tns.repository.ICertificateRepositoryImpl;


public class ICertificateServiceImpl implements ICertificateService

{
	ICertificateRepository dao;
	

	public ICertificateServiceImpl() {
		dao =  new ICertificateRepositoryImpl();
	}

	@Override
	public Certificate addcertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate (certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updatecertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificcate (certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchcertificate(int id) {
		Certificate certificate = dao.searchcertificate(id);
		    return certificate;
	}

	@Override
	public Certificate deletecertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.deleteCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}


}