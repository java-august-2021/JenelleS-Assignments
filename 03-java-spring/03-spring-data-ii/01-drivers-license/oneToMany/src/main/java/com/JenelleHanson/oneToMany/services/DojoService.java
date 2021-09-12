package com.JenelleHanson.oneToMany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.oneToMany.models.Dojo;
import com.JenelleHanson.oneToMany.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;

	public DojoService(DojoRepository dRepo) {
		this.dRepo = dRepo;
	}
	
	public List<Dojo> allDojos() {
		return this.dRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
}
