package com.tns.service;

import com.tns.entity.Certificate;

public interface ICertificateService {
	
	public Certificate addcertificate(Certificate certificate);
	public Certificate updatecertificate(Certificate certificate);
	public Certificate searchcertificate(int id);
	public Certificate deletecertificate(Certificate certificate);

}
