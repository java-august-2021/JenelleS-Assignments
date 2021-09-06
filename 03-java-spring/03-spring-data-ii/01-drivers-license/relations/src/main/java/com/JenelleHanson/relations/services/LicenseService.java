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
		lRepo.save(license);//to get the id you have to save the license first
		String licNum = String.valueOf(license.getId());//this will take the license's Id and change the value into a string
		int zeroes = 6 - licNum.length();//licNum.length() will determine how many digits are in the license and how many zeros need to be appended
		String newLicNum = "";//Now we make a new string that will become the new License with 0's appended eg 000001,000002
		for(int i = 1; i <= zeroes; i++) {
			newLicNum += "0";
		}//for loop helps build the new license string
		newLicNum +=licNum;//adding the original license number 
		license.setNumber(newLicNum); //setting the license number in the model 
		return lRepo.save(license);//saving the updated version
	}
	
	
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
