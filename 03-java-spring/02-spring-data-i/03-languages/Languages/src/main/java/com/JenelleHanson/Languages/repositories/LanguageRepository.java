package com.JenelleHanson.Languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.Languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>  {
	List<Language> findAll();
}
