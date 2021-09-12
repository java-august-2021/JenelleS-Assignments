package com.JenelleHanson.oneToMany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.oneToMany.models.Ninja;
import com.JenelleHanson.oneToMany.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;

	public NinjaService(NinjaRepository nRepo) {
		this.nRepo = nRepo;
	}
	
	public List<Ninja> allNinjas() {
		return this.nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}

}
