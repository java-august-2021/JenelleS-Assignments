package com.JenelleHanson.relations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.relations.models.License;
import com.JenelleHanson.relations.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository lRepo;

	public LicenseService(LicenseRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public List<License> allLicenses() {
		return this.lRepo.findAll();
	}
	
	public License createLicense(License license) {
//		license.setNumber(this.generateLicenseNum(license));
		lRepo.save(license);
		System.out.println(license.getId());
		return lRepo.save(license);
	}
	
//	private String generateLicenseNum(License license) {
//		License lastLicense = lRepo.findFirstByOrderByNumberDesc();
//		if(lastLicense.getNumber() == null) {
//			return lastLicense.setNumber("000001");
//		} else {
//			int lastLicenseNumFormatted = Integer.parseInt(lastLicense.getNumber());
//			lastLicenseNumFormatted++; 
//			
//			StringBuilder sb = new StringBuilder();
//			while (sb.length() < 6 - lastLicenseNumFormatted) {
//    	    sb.append('0');
//			}
//			
//			String newLicNumber = Integer.toString(lastLicenseNumFormatted);
//			return newLicNumber;
//		}
//	}
		
//    	sb.append(idToString);
//    	String licNum = setNumber(sb.toString());
//    	return licNum;
	
	
	
	public License findLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public License updatePerson(License  license) {
		return lRepo.save(license);
	}
	
	public void deleteLicense(Long id) {
		this.lRepo.deleteById(id);
	}
}
