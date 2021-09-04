package com.JenelleHanson.relations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.relations.models.Person;
import com.JenelleHanson.relations.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private final PersonRepository pRepo;

	public PersonService(PersonRepository pRepo) {
		this.pRepo = pRepo;
	}
	
	public List<Person> allPersons() {
		return this.pRepo.findAll();
	}
	
	public Person concievePerson(Person person) {
		return pRepo.save(person);
	}
	
	public Person findPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public Person updatePerson(Person person) {
		return pRepo.save(person);
	}
	
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
}
