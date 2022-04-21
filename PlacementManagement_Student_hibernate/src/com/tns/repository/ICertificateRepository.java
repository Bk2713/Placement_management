package com.tns.repository;

import com.tns.entity.Certificate;


public interface ICertificateRepository 

{
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificcate(Certificate certificate);
	public Certificate searchcertificate(int id);
	public Certificate deleteCertificate(Certificate certificate);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	

}